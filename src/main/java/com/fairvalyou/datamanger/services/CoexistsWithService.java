/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.services;

import com.fairvalyou.datamanger.relationship.CoexistsWith;
import com.fairvalyou.datamanger.repositories.CoexistsWithRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author crtom
 */
@Service
public class CoexistsWithService {

    private final CoexistsWithRepository coexistsWithRepository;

    public CoexistsWithService(CoexistsWithRepository coexistsWithRepository) {
        this.coexistsWithRepository = coexistsWithRepository;
    }

    @Transactional(readOnly = false)
    public CoexistsWith save(CoexistsWith coexistsWith) {
        return coexistsWithRepository.save(coexistsWith);
    }

    @Transactional(readOnly = false)
    public void delete(Long valueOf) {
        coexistsWithRepository.deleteById(valueOf);
    }

    @Transactional(readOnly = true)
    public List<CoexistsWith> findAll() {
        return (List<CoexistsWith>) coexistsWithRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<CoexistsWith> findByUserId(Long userId) {
        return coexistsWithRepository.findByUserId(userId);
    }

    @Transactional(readOnly = true)
    public CoexistsWith findById(Long id) {
        return coexistsWithRepository.findById(id).get();
    }
}
