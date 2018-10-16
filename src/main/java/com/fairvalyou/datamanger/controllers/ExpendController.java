/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.controllers;

import com.fairvalyou.datamanger.relationship.Expend;
import com.fairvalyou.datamanger.services.ExpendService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/expend")
public class ExpendController {
    private final ExpendService expendService;

    public ExpendController(ExpendService expendService) {
        this.expendService = expendService;
    }
    
    @PutMapping("/save")
    public Expend save(@RequestBody Expend expend){
        return expendService.save(expend);
    }
    
    @DeleteMapping("/deleteById")
    public void deleteById(@RequestParam String id){
        expendService.deleteById(Long.valueOf(id));
    }
    
    @GetMapping("/findById")
    public List<Expend> findByUserId(@RequestParam String userId){
        return expendService.findByUserId(Long.valueOf(userId));
    }
}
