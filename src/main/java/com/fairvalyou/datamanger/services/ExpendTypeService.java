/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.services;

import com.fairvalyou.datamanger.domain.node.ExpendType;
import org.springframework.stereotype.Service;
import com.fairvalyou.datamanger.repositories.ExpendTypeRepository;
import java.util.List;

/**
 *
 * @author crtom
 */
@Service
public class ExpendTypeService {

    private final ExpendTypeRepository expendTypeRepository;

    public ExpendTypeService(ExpendTypeRepository expendTypeRepository) {
        this.expendTypeRepository = expendTypeRepository;
    }

    public ExpendType save(ExpendType outflow) {
        return expendTypeRepository.save(outflow);
    }

    public void delele(Long id) {
        expendTypeRepository.deleteById(id);
    }

    public List<ExpendType> findAll() {
        return (List<ExpendType>) expendTypeRepository.findAll();
    }

    public List<ExpendType> findAllHavenotByUserId(Long userId) {
        List<ExpendType> expendTypes = (List<ExpendType>) expendTypeRepository.findAll();
        expendTypeRepository.findAllByUserId(userId).forEach(e->{
            expendTypes.remove(e);
        });
        return expendTypes;
    }


}
