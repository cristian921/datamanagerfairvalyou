/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.repositories;

import com.fairvalyou.datamanger.domain.node.Job;
import java.util.List;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author crtom
 */
public interface JobRepository extends Neo4jRepository<Job, Long>{
    @Query(value = "MATCH (n)-[r:WORK]->(x:Job) where ID(n)={userId} return x")
    List<Job> findAllByUserId(@Param(value = "userId") Long userId);
}
