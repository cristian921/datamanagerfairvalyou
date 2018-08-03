/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.relationship;
import com.fairvalyou.datamanger.domain.DomainObject;
import com.fairvalyou.datamanger.domain.node.User;
import org.neo4j.ogm.annotation.EndNode;

import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 *
 * @author crtom
 */
@RelationshipEntity(type = "PARENT_OF")
public class ParentOf extends DomainObject {

    @StartNode
    private User parent;
    @EndNode
    private User son;

    public ParentOf() {
    }

    public ParentOf(User parent, User son) {
        this.parent = parent;
        this.son = son;
    }

    public User getParent() {
        return parent;
    }

    public void setParent(User parent) {
        this.parent = parent;
    }

    public User getSon() {
        return son;
    }

    public void setSon(User son) {
        this.son = son;
    }

    
}
