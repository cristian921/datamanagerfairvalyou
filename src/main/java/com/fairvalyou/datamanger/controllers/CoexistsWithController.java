/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.controllers;

import com.fairvalyou.datamanger.relationship.CoexistsWith;
import com.fairvalyou.datamanger.relationship.ParentOf;
import com.fairvalyou.datamanger.services.CoexistsWithService;
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
@RequestMapping("/coexistsWith")
public class CoexistsWithController {
     private final CoexistsWithService coexistsWithService;

    public CoexistsWithController(CoexistsWithService coexistsWithService) {
        this.coexistsWithService = coexistsWithService;
    }

    @PutMapping("/save")
    public CoexistsWith save(@RequestBody CoexistsWith coexistsWith) {
        return coexistsWithService.save(coexistsWith);
    }
    
    @PutMapping("/update")
    public CoexistsWith update(@RequestBody CoexistsWith coexistsWith){
       coexistsWithService.delete(coexistsWith.getId());
       return coexistsWithService.save(new CoexistsWith(coexistsWith.getUser(), coexistsWith.getCohabitant(), coexistsWith.getYearOfCoexists()));
    }

    @DeleteMapping("/deleteById")
    public void delete(@RequestParam String id) {
        coexistsWithService.delete(Long.valueOf(id));
    }

    @GetMapping("/findAll")
    public List<CoexistsWith> findAll() {
        return coexistsWithService.findAll();
    }

    @PostMapping("/findByUserId")
    public List<CoexistsWith> findByParentId(@RequestParam String userId) {
        return coexistsWithService.findByUserId(Long.valueOf(userId));
    }

    @PostMapping("/findById")
    public CoexistsWith findById(@RequestParam String id) {
        return coexistsWithService.findById(Long.valueOf(id));
    }

}
