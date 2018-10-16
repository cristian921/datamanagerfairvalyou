/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.controllers;

import com.fairvalyou.datamanger.domain.node.Job;
import com.fairvalyou.datamanger.services.JobService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author crtom
 */

@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
@RestController
@RequestMapping("/jobs")
public class JobsController {
    private final JobService jobService;

    public JobsController(JobService jobService) {
        this.jobService = jobService;
    }
    
    @GetMapping("/findAll")
    public List<Job> findAll(){
        return jobService.findAll();
    }
    
    @GetMapping("/findAllHaveNotByUserId")
    public List<Job> findAllHaveNotByUserId(@RequestParam String id){
        return jobService.findAllHavenotByUserId(Long.valueOf(id));
    } 
    
    @PutMapping("/save")
    public Job save(@RequestBody Job j){
        return jobService.save(j);
    }
    
    @DeleteMapping("/deleteById")
    public void deleteById(@RequestParam String id){
        jobService.deleteById(Long.valueOf(id));
    }
}
