/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.relationship;

import com.fairvalyou.datamanger.domain.DomainObject;
import com.fairvalyou.datamanger.domain.node.ExpendType;
import com.fairvalyou.datamanger.domain.node.GenericUser;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 *
 * @author crtom
 */
@RelationshipEntity(type = "EXPEND")
public class Expend extends DomainObject{
    @StartNode
    private GenericUser genericUser;
    @EndNode
    private ExpendType expendType;
    
    private double amount;
    private double recurrentInMonth;

    public Expend() {
    }

    public Expend(GenericUser genericUser, ExpendType expendType, double amount, double recurrentInMonth) {
        this.genericUser = genericUser;
        this.expendType = expendType;
        this.amount = amount;
        this.recurrentInMonth = recurrentInMonth;
    }

    public GenericUser getGenericUser() {
        return genericUser;
    }

    public void setGenericUser(GenericUser genericUser) {
        this.genericUser = genericUser;
    }

    public ExpendType getExpendType() {
        return expendType;
    }

    public void setExpendType(ExpendType expendType) {
        this.expendType = expendType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRecurrentInMonth() {
        return recurrentInMonth;
    }

    public void setRecurrentInMonth(double recurrentInMonth) {
        this.recurrentInMonth = recurrentInMonth;
    }
    
   
}
