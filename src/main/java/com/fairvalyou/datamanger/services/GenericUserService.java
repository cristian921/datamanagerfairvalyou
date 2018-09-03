/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.services;

import com.fairvalyou.datamanger.domain.node.Customer;
import com.fairvalyou.datamanger.domain.node.GenericUser;
import com.fairvalyou.datamanger.domain.node.User;
import com.fairvalyou.datamanger.repositories.GenericUserRepository;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.neo4j.ogm.cypher.query.Pagination;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author crtom
 */
@Service
public class GenericUserService {

    private final GenericUserRepository genericUserRepository;
    private String fileName;

    public GenericUserService(GenericUserRepository genericUserRepository) {
        this.genericUserRepository = genericUserRepository;
    }

    @Transactional(readOnly = false)
    public GenericUser save(GenericUser user) {
        return genericUserRepository.save(user);
    }

    @Transactional(readOnly = false)
    public void deleteById(Long id) {
        genericUserRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public User findByName(String name) {
        return genericUserRepository.findByName(name);
    }

    @Transactional(readOnly = true)
    public GenericUser findById(Long Id) {
        return genericUserRepository.findById(Id).get();
    }

    @Transactional(readOnly = true)
    public List<GenericUser> findAll() {
        return (List<GenericUser>) genericUserRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Page<GenericUser> findAllPagination(Pageable pageable){
        return genericUserRepository.findAll(pageable);
    }
    
    @Transactional(readOnly = true)
    public Long count(){
        return genericUserRepository.count();
    }
    
    @Transactional(readOnly = true)
    public List<Customer> findAllCustomer() {
        return genericUserRepository.findAllCustomer();
    }

    @Transactional(readOnly = true)
    public List<User> findAllUser() {
        return genericUserRepository.findAllUser();
    }

    @Transactional(readOnly = true)
    public List<GenericUser> findUsersWithOutRelationshipByUserId(Long userId) {
        List<GenericUser> users = new ArrayList<>();
        genericUserRepository.findAll().forEach((user) -> {
            List<GenericUser> userRel = genericUserRepository.findUsersWithRelationshipByUserId(userId);
            userRel.add(genericUserRepository.findById(userId).get());
            if (!userRel.contains(user)) {
                users.add(user);
            }
        });
        return users;
    }

    @Transactional(readOnly = false)
    public void upload(MultipartFile file) throws IOException, InvalidFormatException {
        fileName = file.getOriginalFilename();
        File convFile = new File("src\\main\\resources\\upload\\" + file.getOriginalFilename());
        convFile.createNewFile();
        try (FileOutputStream fos = new FileOutputStream(convFile)) {
            fos.write(file.getBytes());
        }
    }

    @Transactional(readOnly = true)
    public void load() throws IOException, InvalidFormatException {
        try ( // Creating a Workbook from an Excel file (.xls or .xlsx)
                Workbook workbook = WorkbookFactory.create(new File("src\\main\\resources\\upload\\" + fileName))) {
            workbook.forEach(sheet -> {
                System.out.println("=> " + sheet.getSheetName());
            });
            Sheet sheet = workbook.getSheetAt(0);
            DataFormatter dataFormatter = new DataFormatter();
            sheet.forEach(row -> {
                List<String> customer = new ArrayList<>();
                row.forEach(cell -> {
                    String cellValue = dataFormatter.formatCellValue(cell);
                    customer.add(cellValue.toLowerCase());
                    System.out.print(cellValue+" ");
                });
                System.out.println();
                Customer c = new Customer();
                c.setName(customer.get(0));
                c.setDateOfBirth(customer.get(1));
                c.setNationOfBirth(customer.get(2));
                c.setProvinceOfBirth(customer.get(3));
                c.setCityOfBirth(customer.get(4));
                c.setCitizenship(customer.get(5));
                c.setGender(customer.get(6));
                c.setOtherCitizenship("nessuna");
                c.setResidenceNation(customer.get(7));
                c.setResidenceProvince(customer.get(8));
                c.setResidenceCity(customer.get(10));
                c.setDomicileNation(customer.get(7));
                c.setDomicileProvince(customer.get(8));
                c.setDomicileCity(customer.get(10));
                c.setQualification(customer.get(11));
                genericUserRepository.save(c);

            });
            // Closing the workbook
            workbook.close();
        }
    }
}