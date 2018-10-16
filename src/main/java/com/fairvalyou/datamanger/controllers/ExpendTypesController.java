/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.controllers;

import com.fairvalyou.datamanger.domain.node.ExpendType;
import com.fairvalyou.datamanger.services.ExpendTypeService;
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
@RequestMapping("/expendTypes")
public class ExpendTypesController {
    private final ExpendTypeService expendTypeService;

    public ExpendTypesController(ExpendTypeService expendTypeService) {
        this.expendTypeService = expendTypeService;
    }
    
    @PutMapping("/save")
    public ExpendType save(@RequestBody ExpendType expendType){
        return expendTypeService.save(expendType);
    }
    
    @DeleteMapping("/delete")
    public void deleteById(@RequestParam String id){
        expendTypeService.delele(Long.valueOf(id));
    }
    
    @GetMapping("/findAll")
    public List<ExpendType> findAll(){
        return expendTypeService.findAll();
    } 
    
    @GetMapping("/findAllHaveNotByUserId")
    public List<ExpendType> findAllHaveNotByUserId(@RequestParam String userId){
        return  expendTypeService.findAllHavenotByUserId(Long.valueOf(userId));
    }
}
