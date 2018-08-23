/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.services;

import com.fairvalyou.datamanger.relationship.SeparatedFrom;
import com.fairvalyou.datamanger.repositories.SeparatedFromRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author crtom
 */
@Service
public class SeparatedFromService {

    private final SeparatedFromRepository separatedFromRepository;

    public SeparatedFromService(SeparatedFromRepository separatedFromRepository) {
        this.separatedFromRepository = separatedFromRepository;
    }

    @Transactional(readOnly = false)
    public SeparatedFrom save(SeparatedFrom marriedWith) {
        return separatedFromRepository.save(marriedWith);
    }

    @Transactional(readOnly = false)
    public void delete(Long valueOf) {
        separatedFromRepository.deleteById(valueOf);
    }

    @Transactional(readOnly = true)
    public List<SeparatedFrom> findAll() {
        return (List<SeparatedFrom>) separatedFromRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<SeparatedFrom> findByUserId(Long userId) {
        return separatedFromRepository.findByUserId(userId);
    }

    @Transactional(readOnly = true)
    public SeparatedFrom findById(Long id) {
        return separatedFromRepository.findById(id).get();
    }
}
