/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.repositories;

import com.fairvalyou.datamanger.relationship.ParentOf;
import java.util.List;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author crtom
 */
public interface ParentOfRepository extends Neo4jRepository<ParentOf, Long>{
    @Query(value="MATCH p=(n:GenericUser)-[r:PARENT_OF]->(m:GenericUser) where ID(n)={parentId} RETURN p")
    List<ParentOf> findByParentId(@Param(value = "parentId") Long parentId);
    
    @Query(value="MATCH p=(n:GenericUser)-[r:PARENT_OF]->(m:GenericUser) where ID(m)={sonId} RETURN p")
    List<ParentOf> findBySonId(@Param(value = "sonId") Long sonId);
}
