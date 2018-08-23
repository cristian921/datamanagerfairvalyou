/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.controllers;

import com.fairvalyou.datamanger.relationship.CoexistsWith;
import com.fairvalyou.datamanger.relationship.DivorcedFrom;
import com.fairvalyou.datamanger.relationship.MarriedWith;
import com.fairvalyou.datamanger.relationship.ParentOf;
import com.fairvalyou.datamanger.relationship.SeparatedFrom;
import com.fairvalyou.datamanger.relationship.WidowerOf;
import com.fairvalyou.datamanger.services.CoexistsWithService;
import com.fairvalyou.datamanger.services.DivorcedFromService;
import com.fairvalyou.datamanger.services.MarriedWithService;
import com.fairvalyou.datamanger.services.ParentOfService;
import com.fairvalyou.datamanger.services.SeparatedFromService;
import com.fairvalyou.datamanger.services.WidowerOfService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author crtom
 */
@CrossOrigin(origins = {"*"}, maxAge = 5000, allowCredentials = "false")
@RestController
@RequestMapping("/relationship")
public class RelationshipsController {
    private final ParentOfService parentOfService;
    private final CoexistsWithService coexistsWithService;
    private final DivorcedFromService divorcedFromService;
    private final SeparatedFromService separatedFromService;
    private final MarriedWithService marriedWithService;
    private final WidowerOfService widowerOfService;

    public RelationshipsController(ParentOfService parentOfService, CoexistsWithService coexistsWithService, DivorcedFromService divorcedFromService, SeparatedFromService separatedFromService, MarriedWithService marriedWithService, WidowerOfService widowerOfService) {
        this.parentOfService = parentOfService;
        this.coexistsWithService = coexistsWithService;
        this.divorcedFromService = divorcedFromService;
        this.separatedFromService = separatedFromService;
        this.marriedWithService = marriedWithService;
        this.widowerOfService = widowerOfService;
    }
     
    @GetMapping("/findAllRelationshipByUserId")
    public <T> Map<String,List<T>> findAllRelationshipByUserId(@RequestParam String userId){
        Map<String,List<T>> relationships = new HashMap<>();
        
        List<ParentOf> sons = parentOfService.findByParentId(Long.valueOf(userId));
        relationships.put("sons", (List<T>) sons);
        
        List<ParentOf> parents = parentOfService.findBySonId(Long.valueOf(userId));
        relationships.put("parents", (List<T>) parents);
        
        List<CoexistsWith> cohabitants = coexistsWithService.findByUserId(Long.valueOf(userId));
        relationships.put("cohabitants",(List<T>) cohabitants);
        
        List<DivorcedFrom> formerSpouseD = divorcedFromService.findByUserId(Long.valueOf(userId));
        relationships.put("formerSpousesDivorced",(List<T>) formerSpouseD);
        
        List<SeparatedFrom> formerSpouseS = separatedFromService.findByUserId(Long.valueOf(userId));
        relationships.put("formerSpousesSeparated",(List<T>) formerSpouseS);
        
        List<MarriedWith> spouse = marriedWithService.findByUserId(Long.valueOf(userId));
        relationships.put("spouses",(List<T>) spouse);
        
        List<WidowerOf> deadSpouse = widowerOfService.findByUserId(Long.valueOf(userId));
        relationships.put("deadSpouses",(List<T>) deadSpouse);
        
        return relationships;
    }
}
