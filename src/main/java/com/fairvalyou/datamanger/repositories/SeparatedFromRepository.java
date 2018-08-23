/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.repositories;

import com.fairvalyou.datamanger.relationship.DivorcedFrom;
import com.fairvalyou.datamanger.relationship.SeparatedFrom;
import java.util.List;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author crtom
 */
public interface SeparatedFromRepository extends Neo4jRepository<SeparatedFrom, Long>{
    @Query(value = "MATCH p=(n:GenericUser)-[r:SEPARATED_FROM]-(m:GenericUser) where ID(n)={userId} RETURN p")
    List<SeparatedFrom> findByUserId(@Param(value = "userId") Long userId);

}
