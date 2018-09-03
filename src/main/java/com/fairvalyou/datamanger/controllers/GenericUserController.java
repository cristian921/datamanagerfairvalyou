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
import java.io.IOException;
import java.util.List;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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

    @GetMapping("/findAllPageable")
    public Page<GenericUser> findAll(@RequestParam int page,@RequestParam int size) {
        return userService.findAllPagination(PageRequest.of(page, size,Sort.Direction.ASC, "name"));
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
    
    @PutMapping("/upload")
   public void upload(@RequestParam MultipartFile file) throws IOException, InvalidFormatException{
       userService.upload(file);
   }
    
   @PutMapping("/load")
   public void load() throws IOException, InvalidFormatException{
       userService.load();
   }
}
