/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.services;

import com.fairvalyou.datamanger.relationship.Expend;
import com.fairvalyou.datamanger.repositories.ExpendRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author crtom
 */
@Service
public class ExpendService {
    private final ExpendRepository expendRepository;

    public ExpendService(ExpendRepository expendRepository) {
        this.expendRepository = expendRepository;
    }
    
    public Expend save(Expend expend){
        return expendRepository.save(expend);
    }
    
    public void deleteById(Long id){
        expendRepository.deleteById(id);
    }
    
    public List<Expend> findByUserId(Long userId){
        return expendRepository.findByUserId(userId);
    }
}
