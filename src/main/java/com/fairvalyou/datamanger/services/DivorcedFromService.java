/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.services;

import com.fairvalyou.datamanger.relationship.CoexistsWith;
import com.fairvalyou.datamanger.relationship.DivorcedFrom;
import com.fairvalyou.datamanger.repositories.DivorcedFromRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author crtom
 */
@Service
public class DivorcedFromService {

    private final DivorcedFromRepository divorcedFromRepository;

    public DivorcedFromService(DivorcedFromRepository divorcedFromRepository) {
        this.divorcedFromRepository = divorcedFromRepository;
    }

    @Transactional(readOnly = false)
    public DivorcedFrom save(DivorcedFrom divorcedFrom) {
        return divorcedFromRepository.save(divorcedFrom);
    }

    @Transactional(readOnly = false)
    public void delete(Long valueOf) {
        divorcedFromRepository.deleteById(valueOf);
    }

    @Transactional(readOnly = true)
    public List<DivorcedFrom> findAll() {
        return (List<DivorcedFrom>) divorcedFromRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<DivorcedFrom> findByUserId(Long userId) {
        return divorcedFromRepository.findByUserId(userId);
    }

    @Transactional(readOnly = true)
    public DivorcedFrom findById(Long id) {
        return divorcedFromRepository.findById(id).get();
    }
}
