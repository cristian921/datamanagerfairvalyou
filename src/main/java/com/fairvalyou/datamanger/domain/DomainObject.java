/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 *
 * @author crtom
 */
@NodeEntity
public abstract class DomainObject {

    @Id
    @GeneratedValue
    public Long id;

    public DomainObject() {
    }

    public DomainObject(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
}
