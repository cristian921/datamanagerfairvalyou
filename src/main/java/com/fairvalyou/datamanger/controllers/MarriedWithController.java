/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.controllers;

import com.fairvalyou.datamanger.relationship.MarriedWith;
import com.fairvalyou.datamanger.services.MarriedWithService;
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
@RequestMapping("/marriedWith")
public class MarriedWithController {

    private final MarriedWithService marriedWithService;

    public MarriedWithController(MarriedWithService marriedWithService) {
        this.marriedWithService = marriedWithService;
    }

    @PutMapping("/save")
    public MarriedWith save(@RequestBody MarriedWith marriedWith) {
        return marriedWithService.save(marriedWith);
    }
    
     @PutMapping("/update")
    public MarriedWith update(@RequestBody MarriedWith marriedWith){
       marriedWithService.delete(marriedWith.getId());
       return marriedWithService.save(new MarriedWith(marriedWith.getUser(),marriedWith.getSpouse(),marriedWith.getYearMarried(),marriedWith.getMatrimonialRegime()));
    }

    @DeleteMapping("/deleteById")
    public void delete(@RequestParam String id) {
        marriedWithService.delete(Long.valueOf(id));
    }

    @GetMapping("/findAll")
    public List<MarriedWith> findAll() {
        return marriedWithService.findAll();
    }

    @PostMapping("/findByUserId")
    public List<MarriedWith> findByParentId(@RequestParam String userId) {
        return marriedWithService.findByUserId(Long.valueOf(userId));
    }

    @PostMapping("/findById")
    public MarriedWith findById(@RequestParam String id) {
        return marriedWithService.findById(Long.valueOf(id));
    }
}
