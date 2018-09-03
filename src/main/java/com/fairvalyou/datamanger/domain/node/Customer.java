/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.domain.node;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 *
 * @author crtom
 */
@NodeEntity(label = "Customer")
public class Customer extends GenericUser{

    public Customer() {
        type = "Customer";
    }
    
    
}
