/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.relationship;

import com.fairvalyou.datamanger.domain.DomainObject;
import com.fairvalyou.datamanger.domain.node.GenericUser;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 *
 * @author crtom
 */
@RelationshipEntity(type = "WIDOWER_OF")
public class WidowerOf extends DomainObject {

    @StartNode
    private GenericUser user;
    @EndNode
    private GenericUser deadSpouse;

    private int yearOfWidower;
    private double pension;

    public WidowerOf() {
    }

    public WidowerOf(GenericUser user, GenericUser deadSpouse) {
        this.user = user;
        this.deadSpouse = deadSpouse;
    }

    public WidowerOf(GenericUser user, GenericUser deadSpouse, int yearOfWidower, double pension) {
        this.user = user;
        this.deadSpouse = deadSpouse;
        this.yearOfWidower = yearOfWidower;
        this.pension = pension;
    }

    public GenericUser getUser() {
        return user;
    }

    public void setUser(GenericUser user) {
        this.user = user;
    }

    public GenericUser getDeadSpouse() {
        return deadSpouse;
    }

    public void setDeadSpouse(GenericUser deadSpouse) {
        this.deadSpouse = deadSpouse;
    }

    public int getYearOfWidower() {
        return yearOfWidower;
    }

    public void setYearOfWidower(int yearOfWidower) {
        this.yearOfWidower = yearOfWidower;
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

}
