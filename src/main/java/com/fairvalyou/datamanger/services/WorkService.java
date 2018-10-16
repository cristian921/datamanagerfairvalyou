/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.services;

import com.fairvalyou.datamanger.relationship.Expend;
import com.fairvalyou.datamanger.relationship.Work;
import com.fairvalyou.datamanger.repositories.WorkRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author crtom
 */
@Service
public class WorkService {
    private final WorkRepository workRepository;

    public WorkService(WorkRepository workRepository) {
        this.workRepository = workRepository;
    }
    
    public List<Work> findAll(){
        return (List<Work>) workRepository.findAll();
    }
    
    public Work save(Work w){
        return workRepository.save(w);
    }
    
    public void deleteById(Long id){
        workRepository.deleteById(id);
    }
    
    public List<Work> findByUserId(Long id){
        return workRepository.findByUserId(id);
    }
}
