/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.controllers;

import com.fairvalyou.datamanger.domain.node.Customer;
import com.fairvalyou.datamanger.domain.node.GenericUser;
import com.fairvalyou.datamanger.domain.node.User;
import com.fairvalyou.datamanger.services.GenericUserService;
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
@RequestMapping("/genericUsers")
public class GenericUserController {

    private final GenericUserService userService;

    public GenericUserController(GenericUserService userService) {
        this.userService = userService;
    }

    @PutMapping("/saveCustomer")
    public GenericUser save(@RequestBody Customer genericUser) {
        return userService.save(genericUser);
    }
    
    @PutMapping("/saveUser")
    public GenericUser save(@RequestBody User genericUser) {
        return userService.save(genericUser);
    }
 
    @DeleteMapping("/deleteById")
    public void deleteById(@RequestParam String id) {
        userService.deleteById(Long.valueOf(id));
    }
 
    @GetMapping("/findByName")
    public GenericUser findByName(@RequestParam String name) {
        return userService.findByName(name);
    }

    @GetMapping("/findById")
    public GenericUser findById(@RequestParam String id) {
        return userService.findById(Long.valueOf(id));
    }

    @GetMapping("/findAll")
    public List<GenericUser> findAll() {
        return userService.findAll();
    }

    @GetMapping("/findAllCustomer")
    public List<Customer> findCustomer(){
        return userService.findAllCustomer();
    }
    
    @GetMapping("/findAllUser")
    public List<User> findUser(){
        return userService.findAllUser();
    }
    
    @GetMapping("/findAllUsersWithOutRelationshipByUserId")
    public List<GenericUser> findUsersWithOutRelationshipByUserId(@RequestParam String userId) {
        return userService.findUsersWithOutRelationshipByUserId(Long.valueOf(userId));
    }
}
