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
@RelationshipEntity(type = "SEPARATED_FROM")
public class SeparatedFrom extends DomainObject {

    @StartNode
    private GenericUser user;
    @EndNode
    private GenericUser exSpouse;

    private int yearOfSeparation;
    private String typeOfSeparation;
    private Boolean divorceRequest;
    private Boolean houseAssignedToFormerSpouse;

    public SeparatedFrom() {
    }

    public SeparatedFrom(GenericUser user, GenericUser exSpouse) {
        this.user = user;
        this.exSpouse = exSpouse;
    }

    public SeparatedFrom(GenericUser user, GenericUser exSpouse, int yearOfSeparation, String typeOfSeparation, Boolean divorceRequest, Boolean houseAssignedToFormerSpouse) {
        this.user = user;
        this.exSpouse = exSpouse;
        this.yearOfSeparation = yearOfSeparation;
        this.typeOfSeparation = typeOfSeparation;
        this.divorceRequest = divorceRequest;
        this.houseAssignedToFormerSpouse = houseAssignedToFormerSpouse;
    }

    public GenericUser getUser() {
        return user;
    }

    public void setUser(GenericUser user) {
        this.user = user;
    }

    public GenericUser setExSpouse() {
        return exSpouse;
    }

    public void setExSpouse(GenericUser exSpouse) {
        this.exSpouse = exSpouse;
    }

    public int getYearOfSeparation() {
        return yearOfSeparation;
    }

    public void setYearOfSeparation(int yearOfSeparation) {
        this.yearOfSeparation = yearOfSeparation;
    }

    public String getTypeOfSeparation() {
        return typeOfSeparation;
    }

    public void setTypeOfSeparation(String typeOfSeparation) {
        this.typeOfSeparation = typeOfSeparation;
    }

    public Boolean getDivorceRequest() {
        return divorceRequest;
    }

    public void setDivorceRequest(Boolean divorceRequest) {
        this.divorceRequest = divorceRequest;
    }

    public Boolean getHouseAssignedToFormerSpouse() {
        return houseAssignedToFormerSpouse;
    }

    public void setHouseAssignedToFormerSpouse(Boolean houseAssignedToFormerSpouse) {
        this.houseAssignedToFormerSpouse = houseAssignedToFormerSpouse;
    }

    public GenericUser getExSpouse() {
        return exSpouse;
    }

}
