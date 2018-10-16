/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.domain.node;

import com.fairvalyou.datamanger.domain.DomainObject;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 *
 * @author crtom
 */
@NodeEntity(label = "Financial Instrument")
public class FinancialInstrument extends DomainObject{
     private String isin;
    private String name;
    private String currency;
    private String class_;
    private String sicavName;
    private String categoryAssogestioni;
    
    private Double currentYearReturn;
    private Double oneYearReturn;
    private Double threeYearReturn;
    private Double fiveYearReturn;
    private Double tenYearReturn;
    
    private Double oneYearVolatility;
    private Double threeYearVolatility;
    private Double fiveYearVolatility;
    private Double tenYearVolatility;

    private Double oneYearNegativeVolatility;
    private Double threeYearNegativeVolatility;
    private Double fiveYearNegativeVolatility;

    private Double oneYearSharpe;
    private Double threeYearSharpe;
    private Double fiveYearSharpe;
    
    private Double oneYearSortino;
    private Double threeYearSortino;
    private Double fiveYearSortino;
    
    private Double oneYearDrawdown;
    private Double threeYearDrawdown;
    private Double fiveYearDrawdown;
    
    private Double currentYearAnnualisedReturn;
    private Double threeYearAnnualisedReturn;
    private Double fiveYearAnnualisedReturn;
    private Double tenYearAnnualisedReturn;

    public FinancialInstrument() {
    }

    public FinancialInstrument(String isin, String name, String currency, String class_, String sicavName, String categoryAssogestioni, Double currentYearReturn, Double oneYearReturn, Double threeYearReturn, Double fiveYearReturn, Double tenYearReturn, Double oneYearVolatility, Double threeYearVolatility, Double fiveYearVolatility, Double tenYearVolatility, Double oneYearNegativeVolatility, Double threeYearNegativeVolatility, Double fiveYearNegativeVolatility, Double oneYearSharpe, Double threeYearSharpe, Double fiveYearSharpe, Double oneYearSortino, Double threeYearSortino, Double fiveYearSortino, Double oneYearDrawdown, Double threeYearDrawdown, Double fiveYearDrawdown, Double currentYearAnnualisedReturn, Double threeYearAnnualisedReturn, Double fiveYearAnnualisedReturn, Double tenYearAnnualisedReturn) {
        this.isin = isin;
        this.name = name;
        this.currency = currency;
        this.class_ = class_;
        this.sicavName = sicavName;
        this.categoryAssogestioni = categoryAssogestioni;
        this.currentYearReturn = currentYearReturn;
        this.oneYearReturn = oneYearReturn;
        this.threeYearReturn = threeYearReturn;
        this.fiveYearReturn = fiveYearReturn;
        this.tenYearReturn = tenYearReturn;
        this.oneYearVolatility = oneYearVolatility;
        this.threeYearVolatility = threeYearVolatility;
        this.fiveYearVolatility = fiveYearVolatility;
        this.tenYearVolatility = tenYearVolatility;
        this.oneYearNegativeVolatility = oneYearNegativeVolatility;
        this.threeYearNegativeVolatility = threeYearNegativeVolatility;
        this.fiveYearNegativeVolatility = fiveYearNegativeVolatility;
        this.oneYearSharpe = oneYearSharpe;
        this.threeYearSharpe = threeYearSharpe;
        this.fiveYearSharpe = fiveYearSharpe;
        this.oneYearSortino = oneYearSortino;
        this.threeYearSortino = threeYearSortino;
        this.fiveYearSortino = fiveYearSortino;
        this.oneYearDrawdown = oneYearDrawdown;
        this.threeYearDrawdown = threeYearDrawdown;
        this.fiveYearDrawdown = fiveYearDrawdown;
        this.currentYearAnnualisedReturn = currentYearAnnualisedReturn;
        this.threeYearAnnualisedReturn = threeYearAnnualisedReturn;
        this.fiveYearAnnualisedReturn = fiveYearAnnualisedReturn;
        this.tenYearAnnualisedReturn = tenYearAnnualisedReturn;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    public String getSicavName() {
        return sicavName;
    }

    public void setSicavName(String sicavName) {
        this.sicavName = sicavName;
    }

    public String getCategoryAssogestioni() {
        return categoryAssogestioni;
    }

    public void setCategoryAssogestioni(String categoryAssogestioni) {
        this.categoryAssogestioni = categoryAssogestioni;
    }

    public Double getCurrentYearReturn() {
        return currentYearReturn;
    }

    public void setCurrentYearReturn(Double currentYearReturn) {
        this.currentYearReturn = currentYearReturn;
    }

    public Double getOneYearReturn() {
        return oneYearReturn;
    }

    public void setOneYearReturn(Double oneYearReturn) {
        this.oneYearReturn = oneYearReturn;
    }

    public Double getThreeYearReturn() {
        return threeYearReturn;
    }

    public void setThreeYearReturn(Double threeYearReturn) {
        this.threeYearReturn = threeYearReturn;
    }

    public Double getFiveYearReturn() {
        return fiveYearReturn;
    }

    public void setFiveYearReturn(Double fiveYearReturn) {
        this.fiveYearReturn = fiveYearReturn;
    }

    public Double getTenYearReturn() {
        return tenYearReturn;
    }

    public void setTenYearReturn(Double tenYearReturn) {
        this.tenYearReturn = tenYearReturn;
    }

    public Double getOneYearVolatility() {
        return oneYearVolatility;
    }

    public void setOneYearVolatility(Double oneYearVolatility) {
        this.oneYearVolatility = oneYearVolatility;
    }

    public Double getThreeYearVolatility() {
        return threeYearVolatility;
    }

    public void setThreeYearVolatility(Double threeYearVolatility) {
        this.threeYearVolatility = threeYearVolatility;
    }

    public Double getFiveYearVolatility() {
        return fiveYearVolatility;
    }

    public void setFiveYearVolatility(Double fiveYearVolatility) {
        this.fiveYearVolatility = fiveYearVolatility;
    }

    public Double getTenYearVolatility() {
        return tenYearVolatility;
    }

    public void setTenYearVolatility(Double tenYearVolatility) {
        this.tenYearVolatility = tenYearVolatility;
    }

    public Double getOneYearNegativeVolatility() {
        return oneYearNegativeVolatility;
    }

    public void setOneYearNegativeVolatility(Double oneYearNegativeVolatility) {
        this.oneYearNegativeVolatility = oneYearNegativeVolatility;
    }

    public Double getThreeYearNegativeVolatility() {
        return threeYearNegativeVolatility;
    }

    public void setThreeYearNegativeVolatility(Double threeYearNegativeVolatility) {
        this.threeYearNegativeVolatility = threeYearNegativeVolatility;
    }

    public Double getFiveYearNegativeVolatility() {
        return fiveYearNegativeVolatility;
    }

    public void setFiveYearNegativeVolatility(Double fiveYearNegativeVolatility) {
        this.fiveYearNegativeVolatility = fiveYearNegativeVolatility;
    }

    public Double getOneYearSharpe() {
        return oneYearSharpe;
    }

    public void setOneYearSharpe(Double oneYearSharpe) {
        this.oneYearSharpe = oneYearSharpe;
    }

    public Double getThreeYearSharpe() {
        return threeYearSharpe;
    }

    public void setThreeYearSharpe(Double threeYearSharpe) {
        this.threeYearSharpe = threeYearSharpe;
    }

    public Double getFiveYearSharpe() {
        return fiveYearSharpe;
    }

    public void setFiveYearSharpe(Double fiveYearSharpe) {
        this.fiveYearSharpe = fiveYearSharpe;
    }

    public Double getOneYearSortino() {
        return oneYearSortino;
    }

    public void setOneYearSortino(Double oneYearSortino) {
        this.oneYearSortino = oneYearSortino;
    }

    public Double getThreeYearSortino() {
        return threeYearSortino;
    }

    public void setThreeYearSortino(Double threeYearSortino) {
        this.threeYearSortino = threeYearSortino;
    }

    public Double getFiveYearSortino() {
        return fiveYearSortino;
    }

    public void setFiveYearSortino(Double fiveYearSortino) {
        this.fiveYearSortino = fiveYearSortino;
    }

    public Double getOneYearDrawdown() {
        return oneYearDrawdown;
    }

    public void setOneYearDrawdown(Double oneYearDrawdown) {
        this.oneYearDrawdown = oneYearDrawdown;
    }

    public Double getThreeYearDrawdown() {
        return threeYearDrawdown;
    }

    public void setThreeYearDrawdown(Double threeYearDrawdown) {
        this.threeYearDrawdown = threeYearDrawdown;
    }

    public Double getFiveYearDrawdown() {
        return fiveYearDrawdown;
    }

    public void setFiveYearDrawdown(Double fiveYearDrawdown) {
        this.fiveYearDrawdown = fiveYearDrawdown;
    }

    public Double getCurrentYearAnnualisedReturn() {
        return currentYearAnnualisedReturn;
    }

    public void setCurrentYearAnnualisedReturn(Double currentYearAnnualisedReturn) {
        this.currentYearAnnualisedReturn = currentYearAnnualisedReturn;
    }

    public Double getThreeYearAnnualisedReturn() {
        return threeYearAnnualisedReturn;
    }

    public void setThreeYearAnnualisedReturn(Double threeYearAnnualisedReturn) {
        this.threeYearAnnualisedReturn = threeYearAnnualisedReturn;
    }

    public Double getFiveYearAnnualisedReturn() {
        return fiveYearAnnualisedReturn;
    }

    public void setFiveYearAnnualisedReturn(Double fiveYearAnnualisedReturn) {
        this.fiveYearAnnualisedReturn = fiveYearAnnualisedReturn;
    }

    public Double getTenYearAnnualisedReturn() {
        return tenYearAnnualisedReturn;
    }

    public void setTenYearAnnualisedReturn(Double tenYearAnnualisedReturn) {
        this.tenYearAnnualisedReturn = tenYearAnnualisedReturn;
    }

    
    
    
}
