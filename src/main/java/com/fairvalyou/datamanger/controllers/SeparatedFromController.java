/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.controllers;

import com.fairvalyou.datamanger.relationship.SeparatedFrom;
import com.fairvalyou.datamanger.services.SeparatedFromService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author crtom
 */
@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
@RestController
@RequestMapping("/separatedFrom")
public class SeparatedFromController {
    private final SeparatedFromService separatedFromService;

    public SeparatedFromController(SeparatedFromService separatedFromService) {
        this.separatedFromService = separatedFromService;
    }
    
     @PutMapping("/save")
    public SeparatedFrom save(@RequestBody SeparatedFrom separatedFrom) {
        return separatedFromService.save(separatedFrom);
    }
    
    @PutMapping("/update")
    public SeparatedFrom update(@RequestBody SeparatedFrom separatedFrom){
        separatedFromService.delete(separatedFrom.getId());
        return separatedFromService.save(new SeparatedFrom(separatedFrom.getUser(), separatedFrom.getExSpouse(), separatedFrom.getYearOfSeparation(), separatedFrom.getTypeOfSeparation(), separatedFrom.getDivorceRequest(), separatedFrom.getHouseAssignedToFormerSpouse()));
    }

    @DeleteMapping("/deleteById")
    public void delete(@RequestParam String id) {
        separatedFromService.delete(Long.valueOf(id));
    }

    @GetMapping("/findAll")
    public List<SeparatedFrom> findAll() {
        return separatedFromService.findAll();
    }

    @PostMapping("/findByUserId")
    public List<SeparatedFrom> findByParentId(@RequestParam String userId) {
        return separatedFromService.findByUserId(Long.valueOf(userId));
    }

    @PostMapping("/findById")
    public SeparatedFrom findById(@RequestParam String id) {
        return separatedFromService.findById(Long.valueOf(id));
    }
}
