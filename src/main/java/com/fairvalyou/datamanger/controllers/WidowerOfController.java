/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.controllers;

import com.fairvalyou.datamanger.relationship.WidowerOf;
import com.fairvalyou.datamanger.services.WidowerOfService;
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
@RequestMapping("/widowerOf")
public class WidowerOfController {
    private final WidowerOfService widowerOfService;

    public WidowerOfController(WidowerOfService widowerOfService) {
        this.widowerOfService = widowerOfService;
    }
    
     @PutMapping("/save")
    public WidowerOf save(@RequestBody WidowerOf widowerOf) {
        return widowerOfService.save(widowerOf);
    }

     @PutMapping("/update")
    public WidowerOf update(@RequestBody WidowerOf widowerOf){
       widowerOfService.delete(widowerOf.getId());
       return widowerOfService.save(new WidowerOf(widowerOf.getUser(), widowerOf.getDeadSpouse(), widowerOf.getYearOfWidower(), widowerOf.getPension()));
    }
    
    @DeleteMapping("/deleteById")
    public void delete(@RequestParam String id) {
        widowerOfService.delete(Long.valueOf(id));
    }

    @GetMapping("/findAll")
    public List<WidowerOf> findAll() {
        return widowerOfService.findAll();
    }

    @PostMapping("/findByUserId")
    public List<WidowerOf> findByParentId(@RequestParam String userId) {
        return widowerOfService.findByUserId(Long.valueOf(userId));
    }

    @PostMapping("/findById")
    public WidowerOf findById(@RequestParam String id) {
        return widowerOfService.findById(Long.valueOf(id));
    }
}
