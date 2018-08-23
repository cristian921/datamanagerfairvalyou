/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.repositories;

import com.fairvalyou.datamanger.domain.node.Customer;
import com.fairvalyou.datamanger.domain.node.User;
import java.util.List;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author crtom
 */
@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerRepository extends Neo4jRepository<Customer, Long>{
    @Query(value = "MATCH (n:User)-[r]-(p:User) where ID(n) ={customerId} return p")
    List<User> findUsersWithRelationshipByCustomerId(@Param(value = "customerId") Long customerId);
}
