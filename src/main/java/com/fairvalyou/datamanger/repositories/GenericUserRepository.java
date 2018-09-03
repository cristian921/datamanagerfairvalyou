/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.repositories;

import com.fairvalyou.datamanger.domain.node.Customer;
import com.fairvalyou.datamanger.domain.node.GenericUser;
import com.fairvalyou.datamanger.domain.node.User;
import java.util.List;
import org.neo4j.ogm.cypher.query.Pagination;
import org.springframework.data.domain.Page;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author crtom
 */
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface GenericUserRepository extends Neo4jRepository<GenericUser, Long> {

    User findByName(@Param(value = "name") String name);
    
    @Query(value = "MATCH (n:GenericUser)-[r]-(p:GenericUser) where ID(n) ={userId} return p")
    List<GenericUser> findUsersWithRelationshipByUserId(@Param(value = "userId") Long userId);
    
    @Query(value = "MATCH (n:Customer) return n")
    List<Customer> findAllCustomer();
    
    @Query(value = "MATCH (n:User) return n")
    List<User> findAllUser();
}
