/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.repositories;

import com.fairvalyou.datamanger.relationship.ParentOf;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 *
 * @author crtom
 */
public interface ParentOfRepository extends Neo4jRepository<ParentOf, Long>{
    
}
