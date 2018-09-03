/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.services;

import com.fairvalyou.datamanger.domain.node.Customer;
import com.fairvalyou.datamanger.repositories.CustomerRepository;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author crtom
 */
@Service
public class CustomerService {

    public final CustomerRepository customerRepository;
    public String fileName = null;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional(readOnly = false)
    public Customer save(Customer user) {
        return customerRepository.save(user);
    }

    @Transactional(readOnly = false)
    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Customer findById(Long Id) {
        return customerRepository.findById(Id).get();
    }

    @Transactional(readOnly = true)
    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }
}
