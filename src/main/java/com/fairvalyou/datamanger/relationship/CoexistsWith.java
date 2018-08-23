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
@RelationshipEntity(type = "COEXISTS_WITH")
public class CoexistsWith extends DomainObject {

    @StartNode
    private GenericUser user;
    @EndNode
    private GenericUser cohabitant;

    private int yearOfCoexists;

    public CoexistsWith() {
    }

    public CoexistsWith(GenericUser user, GenericUser cohabitant) {
        this.user = user;
        this.cohabitant = cohabitant;
    }

    public CoexistsWith(GenericUser user, GenericUser cohabitant, int yearOfCoexists) {
        this.user = user;
        this.cohabitant = cohabitant;
        this.yearOfCoexists = yearOfCoexists;
    }

    public GenericUser getUser() {
        return user;
    }

    public void setUser(GenericUser user) {
        this.user = user;
    }

    public GenericUser getCohabitant() {
        return cohabitant;
    }

    public void setCohabitant(GenericUser cohabitant) {
        this.cohabitant = cohabitant;
    }

    public int getYearOfCoexists() {
        return yearOfCoexists;
    }

    public void setYearOfCoexists(int yearOfCoexists) {
        this.yearOfCoexists = yearOfCoexists;
    }

}
