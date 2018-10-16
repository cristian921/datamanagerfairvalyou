/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.repositories;

import com.fairvalyou.datamanger.domain.node.FinancialInstrument;
import java.util.List;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 *
 * @author crtom
 */
public interface FinancialInstrumentRepository extends Neo4jRepository<FinancialInstrument, Long>{

    @Query(value = "MATCH ( n:Found ) RETURN n")
    public List<FinancialInstrument> findAllFounds();
    
     @Query(value = "MATCH ( n:Etf ) RETURN n")
    public List<FinancialInstrument> findAllEtf();
    
     @Query(value = "MATCH ( n:Certificates ) RETURN n")
    public List<FinancialInstrument> findAllCertificates();
    
}
