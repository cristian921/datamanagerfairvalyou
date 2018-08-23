/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.services;

import com.fairvalyou.datamanger.relationship.MarriedWith;
import com.fairvalyou.datamanger.repositories.MarriedWithRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author crtom
 */
@Service
public class MarriedWithService {

    private final MarriedWithRepository marriedWithRepository;

    public MarriedWithService(MarriedWithRepository marriedWithRepository) {
        this.marriedWithRepository = marriedWithRepository;
    }

    @Transactional(readOnly = false)
    public MarriedWith save(MarriedWith marriedWith) {
        return marriedWithRepository.save(marriedWith);
    }

    @Transactional(readOnly = false)
    public void delete(Long valueOf) {
        marriedWithRepository.deleteById(valueOf);
    }

    @Transactional(readOnly = true)
    public List<MarriedWith> findAll() {
        return (List<MarriedWith>) marriedWithRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<MarriedWith> findByUserId(Long userId) {
        return marriedWithRepository.findByUserId(userId);
    }

    @Transactional(readOnly = true)
    public MarriedWith findById(Long id) {
        return marriedWithRepository.findById(id).get();
    }
}
