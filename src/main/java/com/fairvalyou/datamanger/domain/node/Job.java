/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.domain.node;

import com.fairvalyou.datamanger.domain.DomainObject;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 *
 * @author crtom
 */
@NodeEntity
public class Job extends DomainObject{
    private String job;
    
    public Job() {
    }

    public Job(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    
}
