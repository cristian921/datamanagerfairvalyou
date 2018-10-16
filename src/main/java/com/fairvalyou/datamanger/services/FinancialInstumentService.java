/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.services;

import com.fairvalyou.datamanger.domain.node.Certificates;
import com.fairvalyou.datamanger.domain.node.Etf;
import com.fairvalyou.datamanger.domain.node.FinancialInstrument;
import com.fairvalyou.datamanger.domain.node.Found;
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

    @Transactional(readOnly = true)
    public List<FinancialInstrument> findAll() {
        return (List<FinancialInstrument>) financialInstrumentRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<FinancialInstrument> findByType(String type) {
        switch (type) {
            case "found":
                return financialInstrumentRepository.findAllFounds();
            case "etf":
                return financialInstrumentRepository.findAllEtf();
            case "certificates":
                return financialInstrumentRepository.findAllCertificates();
            default:
                return new ArrayList<>();
        }
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
    public void load(String type) throws IOException, InvalidFormatException {
        try ( // Creating a Workbook from an Excel file (.xls or .xlsx)
                Workbook workbook = WorkbookFactory.create(new File("src\\main\\resources\\upload\\" + fileName))) {

            Sheet sheet = workbook.getSheetAt(0);
            sheet.removeRow(sheet.getRow(0));
            DataFormatter dataFormatter = new DataFormatter();
            sheet.forEach(row -> {
                List<String> financialInstruments = new ArrayList<>();
                row.forEach(cell -> {
                    String cellValue = dataFormatter.formatCellValue(cell);
                    financialInstruments.add(cellValue);
                    //        System.out.print(cellValue + "****");
                });

                FinancialInstrument fi = null;

                switch (type) {
                    case "found":
                        fi = new Found();
                        break;
                    case "etf":
                        fi = new Etf();
                        break;
                    case "certificates":
                        fi = new Certificates();
                        break;
                    default:
                        fi = new FinancialInstrument();
                        break;
                }

                System.out.println(fi.getClass());

                fi.setName(financialInstruments.get(0));
                fi.setCurrency(financialInstruments.get(1));
                fi.setIsin(financialInstruments.get(2));
                fi.setClass_(financialInstruments.get(3));
                fi.setSicavName(financialInstruments.get(4));
                fi.setCategoryAssogestioni(financialInstruments.get(5));;

                fi.setCurrentYearReturn(percentageToDouble(financialInstruments.get(6)));
                fi.setOneYearReturn(percentageToDouble(financialInstruments.get(7)));
                fi.setThreeYearReturn(percentageToDouble(financialInstruments.get(8)));
                fi.setFiveYearReturn(percentageToDouble(financialInstruments.get(9)));
                fi.setTenYearReturn(percentageToDouble(financialInstruments.get(10)));

                fi.setOneYearVolatility(percentageToDouble(financialInstruments.get(11)));
                fi.setThreeYearVolatility(percentageToDouble(financialInstruments.get(12)));
                fi.setFiveYearVolatility(percentageToDouble(financialInstruments.get(13)));
                fi.setTenYearVolatility(percentageToDouble(financialInstruments.get(14)));

                fi.setOneYearNegativeVolatility(percentageToDouble(financialInstruments.get(15)));
                fi.setThreeYearNegativeVolatility(percentageToDouble(financialInstruments.get(16)));
                fi.setFiveYearNegativeVolatility(percentageToDouble(financialInstruments.get(17)));

                fi.setOneYearSharpe(percentageToDouble(financialInstruments.get(18)));
                fi.setThreeYearSharpe(percentageToDouble(financialInstruments.get(19)));
                fi.setFiveYearSharpe(percentageToDouble(financialInstruments.get(20)));

                fi.setOneYearSortino(percentageToDouble(financialInstruments.get(21)));
                fi.setThreeYearSortino(percentageToDouble(financialInstruments.get(22)));
                fi.setFiveYearSortino(percentageToDouble(financialInstruments.get(23)));

                fi.setOneYearDrawdown(percentageToDouble(financialInstruments.get(24)));
                fi.setThreeYearDrawdown(percentageToDouble(financialInstruments.get(25)));
                fi.setFiveYearDrawdown(percentageToDouble(financialInstruments.get(26)));

                fi.setCurrentYearAnnualisedReturn(percentageToDouble(financialInstruments.get(27)));
                fi.setThreeYearAnnualisedReturn(percentageToDouble(financialInstruments.get(28)));
                fi.setFiveYearAnnualisedReturn(percentageToDouble(financialInstruments.get(29)));
                fi.setTenYearAnnualisedReturn(percentageToDouble(financialInstruments.get(30)));

                financialInstrumentRepository.save(fi);

            });
            // Closing the workbook
            workbook.close();
        }
    }

    private Double percentageToDouble(String percentage) {
        Double d = null;
        try {
            d = Double.valueOf(percentage.replaceAll("%", "").replaceAll(",", ".")) / 100;
        } catch (Exception exception) {

        }
        return d;
    }
}
