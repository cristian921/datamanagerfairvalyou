/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.controllers;

import com.fairvalyou.datamanger.relationship.DivorcedFrom;
import com.fairvalyou.datamanger.services.DivorcedFromService;
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
@RequestMapping("/divorcedFrom")
public class DivorcedFromController {

    private final DivorcedFromService divorcedFromService;

    public DivorcedFromController(DivorcedFromService divorcedFromService) {
        this.divorcedFromService = divorcedFromService;
    }

    @PutMapping("/save")
    public DivorcedFrom save(@RequestBody DivorcedFrom divorcedFrom) {
        return divorcedFromService.save(divorcedFrom);
    }
    
    @PutMapping("/update")
    public DivorcedFrom update(@RequestBody DivorcedFrom divorcedFrom){
       divorcedFromService.delete(divorcedFrom.getId());
       return divorcedFromService.save(new DivorcedFrom(divorcedFrom.getUser(), 
               divorcedFrom.getFormerSpouse(), divorcedFrom.getYearOfDivorce(), 
               divorcedFrom.getDivorceCheck(), divorcedFrom.getHouseAssignedToFormerSpouse(), 
               divorcedFrom.getLiquidation()));
    }

    @DeleteMapping("/deleteById")
    public void delete(@RequestParam String id) {
        divorcedFromService.delete(Long.valueOf(id));
    }

    @GetMapping("/findAll")
    public List<DivorcedFrom> findAll() {
        return divorcedFromService.findAll();
    }

    @PostMapping("/findByUserId")
    public List<DivorcedFrom> findByParentId(@RequestParam String userId) {
        return divorcedFromService.findByUserId(Long.valueOf(userId));
    }

    @PostMapping("/findById")
    public DivorcedFrom findById(@RequestParam String id) {
        return divorcedFromService.findById(Long.valueOf(id));
    }
}
