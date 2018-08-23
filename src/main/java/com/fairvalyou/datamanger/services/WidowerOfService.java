/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.services;

import com.fairvalyou.datamanger.relationship.WidowerOf;
import com.fairvalyou.datamanger.repositories.WidowerOfRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author crtom
 */
@Service
public class WidowerOfService {

    private final WidowerOfRepository widowerOfRepository;

    public WidowerOfService(WidowerOfRepository widowerOfRepository) {
        this.widowerOfRepository = widowerOfRepository;
    }

    @Transactional(readOnly = false)
    public WidowerOf save(WidowerOf widowerOf) {
        return widowerOfRepository.save(widowerOf);
    }

    @Transactional(readOnly = false)
    public void delete(Long valueOf) {
        widowerOfRepository.deleteById(valueOf);
    }

    @Transactional(readOnly = true)
    public List<WidowerOf> findAll() {
        return (List<WidowerOf>) widowerOfRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<WidowerOf> findByUserId(Long userId) {
        return widowerOfRepository.findByUserId(userId);
    }

    @Transactional(readOnly = true)
    public WidowerOf findById(Long id) {
        return widowerOfRepository.findById(id).get();
    }
}
