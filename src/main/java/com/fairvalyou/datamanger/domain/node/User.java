/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.domain.node;


import com.fairvalyou.datamanger.domain.DomainObject;
import com.fairvalyou.datamanger.relationship.ParentOf;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;


/**
 *
 * @author crtom
 */
@NodeEntity(label = "User")
public class User extends GenericUser {

}
