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
@RelationshipEntity(type = "PARENT_OF")
public class ParentOf extends DomainObject {

    @StartNode
    private GenericUser parent;
    @EndNode
    private GenericUser son;

    public ParentOf() {
    }

    public ParentOf(GenericUser parent, GenericUser son) {
        this.parent = parent;
        this.son = son;
    }

    public GenericUser getParent() {
        return parent;
    }

    public void setParent(GenericUser parent) {
        this.parent = parent;
    }

    public GenericUser getSon() {
        return son;
    }

    public void setSon(GenericUser son) {
        this.son = son;
    }

}
