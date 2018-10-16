/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.relationship;

import com.fairvalyou.datamanger.domain.DomainObject;
import com.fairvalyou.datamanger.domain.node.GenericUser;
import com.fairvalyou.datamanger.domain.node.Job;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 *
 * @author crtom
 */
@RelationshipEntity(type = "WORK")
public class Work extends DomainObject{
    
    @StartNode
    private GenericUser genericUser;
    @EndNode
    private Job job;
    
    private Double salary;
    private String contractType;

    public Work() {
    }

    public Work(GenericUser genericUser, Job job, Double salary, String contractType) {
        this.genericUser = genericUser;
        this.job = job;
        this.salary = salary;
        this.contractType = contractType;
    }

    public GenericUser getGenericUser() {
        return genericUser;
    }

    public void setGenericUser(GenericUser genericUser) {
        this.genericUser = genericUser;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }
    
    

}
