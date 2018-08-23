/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.services;

import com.fairvalyou.datamanger.domain.node.Customer;
import com.fairvalyou.datamanger.domain.node.GenericUser;
import com.fairvalyou.datamanger.domain.node.User;
import com.fairvalyou.datamanger.repositories.GenericUserRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author crtom
 */
@Service
public class GenericUserService {

    private final GenericUserRepository genericUserRepository;

    public GenericUserService(GenericUserRepository genericUserRepository) {
        this.genericUserRepository = genericUserRepository;
    }

    @Transactional(readOnly = false)
    public GenericUser save(GenericUser user) {
        return genericUserRepository.save(user);
    }

    @Transactional(readOnly = false)
    public void deleteById(Long id) {
        genericUserRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public User findByName(String name) {
        return genericUserRepository.findByName(name);
    }

    @Transactional(readOnly = true)
    public GenericUser findById(Long Id) {
        return genericUserRepository.findById(Id).get();
    }

    @Transactional(readOnly = true)
    public List<GenericUser> findAll() {
        return (List<GenericUser>) genericUserRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<Customer> findAllCustomer() {
        return genericUserRepository.findAllCustomer();
    }

    @Transactional(readOnly = true)
    public List<User> findAllUser() {
        return genericUserRepository.findAllUser();
    }

    @Transactional(readOnly = true)
    public List<GenericUser> findUsersWithOutRelationshipByUserId(Long userId) {
        List<GenericUser> users = new ArrayList<>();
        genericUserRepository.findAll().forEach((user) -> {
            List<GenericUser> userRel = genericUserRepository.findUsersWithRelationshipByUserId(userId);
            userRel.add(genericUserRepository.findById(userId).get());
            if (!userRel.contains(user)) {
                users.add(user);
            }
        });
        return users;
    }
}
