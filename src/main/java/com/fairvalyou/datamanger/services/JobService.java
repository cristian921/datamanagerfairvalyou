/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.services;

import com.fairvalyou.datamanger.domain.node.Job;
import com.fairvalyou.datamanger.repositories.JobRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author crtom
 */
@Service
public class JobService {
    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }
    
    public List<Job> findAll(){
        return (List<Job>) jobRepository.findAll();
    }
    
    public Job save(Job j){
        return jobRepository.save(j);
    }
    
    public void deleteById(Long id){
        jobRepository.deleteById(id);
    }
    
    public List<Job> findAllHavenotByUserId(Long id){
        List<Job> jobs = (List<Job>) jobRepository.findAll();
        jobRepository.findAllByUserId(id).forEach(cnsmr->{
            jobs.remove(cnsmr);
        });
        return jobs;
    }
}
