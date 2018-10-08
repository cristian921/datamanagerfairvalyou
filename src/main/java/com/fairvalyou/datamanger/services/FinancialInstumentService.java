/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.services;

import com.fairvalyou.datamanger.domain.node.Customer;
import com.fairvalyou.datamanger.repositories.FinancialInstrumentRepository;
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
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author crtom
 */
@Service
public class FinancialInstumentService {

    private final FinancialInstrumentRepository financialInstrumentRepository;
    private String fileName;
    
    public FinancialInstumentService(FinancialInstrumentRepository financialInstrumentRepository) {
        this.financialInstrumentRepository = financialInstrumentRepository;
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
                List<String> financialInstruments = new ArrayList<>();
                row.forEach(cell -> {
                    String cellValue = dataFormatter.formatCellValue(cell);
                    financialInstruments.add(cellValue.toLowerCase());
                    System.out.print(cellValue+" ");
                });
                System.out.println();
              

            });
            // Closing the workbook
            workbook.close();
        }
    }

}
