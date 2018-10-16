/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.repositories;

import com.fairvalyou.datamanger.domain.node.ExpendType;
import java.util.List;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author crtom
 */
public interface ExpendTypeRepository extends Neo4jRepository<ExpendType, Long> {
    
    @Query(value = "MATCH (n)-[r:EXPEND]->(x:ExpendType) where ID(n)={userId} return x")
    List<ExpendType> findAllByUserId(@Param(value = "userId") Long userId);
}
