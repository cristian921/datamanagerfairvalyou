/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.relationship;

import com.fairvalyou.datamanger.domain.DomainObject;
import com.fairvalyou.datamanger.domain.node.GenericUser;
import com.fairvalyou.datamanger.domain.node.User;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 *
 * @author crtom
 */
@RelationshipEntity(type = "DIVORCED_FROM")
public class DivorcedFrom extends DomainObject {

    @StartNode
    private GenericUser user;
    @EndNode
    private GenericUser formerSpouse;

    private int yearOfDivorce;
    private double divorceCheck;
    private Boolean houseAssignedToFormerSpouse;
    private double liquidation;

    public DivorcedFrom() {
    }

    public DivorcedFrom(GenericUser user, GenericUser formerSpouse) {
        this.user = user;
        this.formerSpouse = formerSpouse;
    }

    public DivorcedFrom(GenericUser user, GenericUser formerSpouse, int yearOfDivorce, double divorceCheck, Boolean houseAssignedToFormerSpouse, double liquidation) {
        this.user = user;
        this.formerSpouse = formerSpouse;
        this.yearOfDivorce = yearOfDivorce;
        this.divorceCheck = divorceCheck;
        this.houseAssignedToFormerSpouse = houseAssignedToFormerSpouse;
        this.liquidation = liquidation;
    }

    public int getYearOfDivorce() {
        return yearOfDivorce;
    }

    public void setYearOfDivorce(int yearOfDivorce) {
        this.yearOfDivorce = yearOfDivorce;
    }

    public double getDivorceCheck() {
        return divorceCheck;
    }

    public void setDivorceCheck(double divorceCheck) {
        this.divorceCheck = divorceCheck;
    }

    public Boolean getHouseAssignedToFormerSpouse() {
        return houseAssignedToFormerSpouse;
    }

    public void setHouseAssignedToFormerSpouse(Boolean houseAssignedToFormerSpouse) {
        this.houseAssignedToFormerSpouse = houseAssignedToFormerSpouse;
    }

    public double getLiquidation() {
        return liquidation;
    }

    public void setLiquidation(double liquidation) {
        this.liquidation = liquidation;
    }

    public GenericUser getUser() {
        return user;
    }

    public void setUser(GenericUser user) {
        this.user = user;
    }

    public GenericUser getFormerSpouse() {
        return formerSpouse;
    }

    public void setFormerSpouse(GenericUser formerSpouse) {
        this.formerSpouse = formerSpouse;
    }

}
