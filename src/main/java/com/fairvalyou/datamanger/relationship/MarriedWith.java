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
@RelationshipEntity(type = "MARRIED_WITH")
public class MarriedWith extends DomainObject {

    @StartNode
    private GenericUser user;
    @EndNode
    private GenericUser spouse;

    private int yearMarried;
    private String matrimonialRegime;

    public MarriedWith() {
    }

    public MarriedWith(GenericUser user, GenericUser spouse) {
        this.user = user;
        this.spouse = spouse;
    }

    public MarriedWith(GenericUser user, GenericUser spouse, int yearMarried, String matrimonialRegime) {
        this.user = user;
        this.spouse = spouse;
        this.yearMarried = yearMarried;
        this.matrimonialRegime = matrimonialRegime;
    }

    public GenericUser getUser() {
        return user;
    }

    public void setUser(GenericUser user) {
        this.user = user;
    }

    public GenericUser getSpouse() {
        return spouse;
    }

    public void setSpouse(GenericUser spouse) {
        this.spouse = spouse;
    }

    public int getYearMarried() {
        return yearMarried;
    }

    public void setYearMarried(int yearMarried) {
        this.yearMarried = yearMarried;
    }

    public String getMatrimonialRegime() {
        return matrimonialRegime;
    }

    public void setMatrimonialRegime(String matrimonialRegime) {
        this.matrimonialRegime = matrimonialRegime;
    }

}
