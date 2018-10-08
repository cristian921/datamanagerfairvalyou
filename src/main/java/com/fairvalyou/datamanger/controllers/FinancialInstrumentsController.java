/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.controllers;

import com.fairvalyou.datamanger.services.FinancialInstumentService;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author crtom
 */
@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
@RestController
@RequestMapping("/financialInstruments")
public class FinancialInstrumentsController {

    private final FinancialInstumentService financialInstumentService;

    public FinancialInstrumentsController(FinancialInstumentService financialInstumentService) {
        this.financialInstumentService = financialInstumentService;
    }

    @PutMapping("/upload")
    public void upload(@RequestParam MultipartFile file) throws IOException, InvalidFormatException {
        financialInstumentService.upload(file);
    }

    @PutMapping("/load")
    public void load() throws IOException, InvalidFormatException {
        financialInstumentService.load();
    }
}
