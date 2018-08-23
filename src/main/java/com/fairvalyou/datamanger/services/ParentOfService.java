/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.services;

import com.fairvalyou.datamanger.domain.node.User;
import com.fairvalyou.datamanger.relationship.ParentOf;
import com.fairvalyou.datamanger.repositories.ParentOfRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author crtom
 */
@Service
public class ParentOfService {

    private final ParentOfRepository parentOfRepository;

    public ParentOfService(ParentOfRepository parentOfRepository) {
        this.parentOfRepository = parentOfRepository;
    }

    @Transactional(readOnly = false)
    public ParentOf save(ParentOf parentOf) {
        return parentOfRepository.save(parentOf);
    }

    @Transactional(readOnly = false)
    public void delete(Long valueOf) {
        parentOfRepository.deleteById(valueOf);
    }

    @Transactional(readOnly = true)
    public List<ParentOf> findAll() {
        return (List<ParentOf>) parentOfRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<ParentOf> findByParentId(Long parentId) {
        return parentOfRepository.findByParentId(parentId);
    }

    @Transactional(readOnly = true)
    public List<ParentOf> findBySonId(Long sonId) {
        return parentOfRepository.findBySonId(sonId);
    }

    @Transactional(readOnly = true)
    public ParentOf findById(Long id) {
        return parentOfRepository.findById(id).get();
    }
}
