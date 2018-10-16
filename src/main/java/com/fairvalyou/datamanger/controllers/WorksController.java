/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.controllers;

import com.fairvalyou.datamanger.relationship.Work;
import com.fairvalyou.datamanger.services.WorkService;
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
@RequestMapping("/works")
public class WorksController {

    private final WorkService workService;

    public WorksController(WorkService workService) {
        this.workService = workService;
    }

    @GetMapping("/findAll")
    public List<Work> findAll(){
        return workService.findAll();
    }
    
    @GetMapping("/findById")
    public List<Work> findByUserId(@RequestParam String userId){
        return workService.findByUserId(Long.valueOf(userId));
    }
    
    @DeleteMapping("/deleteById")
    public void deleteById(@RequestParam String id){
        workService.deleteById(Long.valueOf(id));
    }
    
    @PutMapping("/save")
    public Work save(@RequestBody Work w){
        return workService.save(w);
    }
}
