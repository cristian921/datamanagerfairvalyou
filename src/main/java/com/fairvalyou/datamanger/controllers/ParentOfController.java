/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.controllers;

import com.fairvalyou.datamanger.relationship.ParentOf;
import com.fairvalyou.datamanger.services.ParentOfService;
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
@RequestMapping("/parentOf")
public class ParentOfController {

    private final ParentOfService parentOfService;

    public ParentOfController(ParentOfService parentOfService) {
        this.parentOfService = parentOfService;
    }

    @PutMapping("/save")
    public ParentOf save(@RequestBody ParentOf parentOf) {
        return parentOfService.save(parentOf);
    }

    @PutMapping("/update")
    public ParentOf update(@RequestBody ParentOf parentOf){
       parentOfService.delete(parentOf.getId());
       return parentOfService.save(new ParentOf(parentOf.getParent(), parentOf.getSon()));
    }
    
    @DeleteMapping("/deleteById")
    public void delete(@RequestParam String id) {
        parentOfService.delete(Long.valueOf(id));
    }

    @GetMapping("/findAll")
    public List<ParentOf> findAll() {
        return parentOfService.findAll();
    }

    @PostMapping("/findByParentId")
    public List<ParentOf> findByParentId(@RequestParam String parentId) {
        return parentOfService.findByParentId(Long.valueOf(parentId));
    }

    @PostMapping("/findById")
    public ParentOf findById(@RequestParam String id) {
        return parentOfService.findById(Long.valueOf(id));
    }
    
    @PostMapping("/findBySonId")
    public List<ParentOf> findBySonId(@RequestParam String sonId) {
        return parentOfService.findBySonId(Long.valueOf(sonId));
    }
}
