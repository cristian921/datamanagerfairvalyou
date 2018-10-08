/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.repositories;

import com.fairvalyou.datamanger.domain.node.FinancialInstrument;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 *
 * @author crtom
 */
public interface FinancialInstrumentRepository extends Neo4jRepository<FinancialInstrument, Long>{
    
}
