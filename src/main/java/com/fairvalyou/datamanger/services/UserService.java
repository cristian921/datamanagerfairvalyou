/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.services;

import com.fairvalyou.datamanger.domain.node.User;
import com.fairvalyou.datamanger.relationship.ParentOf;
import com.fairvalyou.datamanger.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author crtom
 */
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(readOnly = false)
    public User save(User user) {
        return userRepository.save(user);
    }

    @Transactional(readOnly = false)
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Transactional(readOnly = true)
    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    @Transactional(readOnly = true)
    public User findById(Long Id) {
        return userRepository.findById(Id).get();
    }
}
