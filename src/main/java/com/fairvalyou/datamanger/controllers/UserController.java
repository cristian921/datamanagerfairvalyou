/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.controllers;

import com.fairvalyou.datamanger.domain.node.User;
import com.fairvalyou.datamanger.relationship.ParentOf;
import com.fairvalyou.datamanger.services.ParentOfService;
import com.fairvalyou.datamanger.services.UserService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author crtom
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final ParentOfService parentOfService;

    public UserController(UserService userService, ParentOfService parentOfService) {
        this.userService = userService;
        this.parentOfService = parentOfService;
    }

    @GetMapping("/save")
    public User save(@RequestParam String name) {
        User user = new User();
        user.setName(name);
        return userService.save(user);
    }

    @GetMapping("/deleteByName")
    public void deleteByName(@RequestParam String name) {
        userService.delete(userService.findByName(name));
    }
    
    @GetMapping("/findByName")
    public User findByName(@RequestParam String name){
        return userService.findByName(name);
    }
    
    @GetMapping("/findById")
    public User findById(@RequestParam String id){
        return userService.findById(Long.valueOf(id));
    }
    
    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
    
    @GetMapping("/addSon")
    public ParentOf addSon(@RequestParam String idParent,@RequestParam String idSon){
        return parentOfService.save(new ParentOf(userService.findById(Long.valueOf(idParent)), userService.findById(Long.valueOf(idSon))));
    }

}
