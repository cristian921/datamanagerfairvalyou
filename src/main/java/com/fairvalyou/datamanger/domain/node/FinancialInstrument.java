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
    private String currentYearReturn;
    private String oneYearReturn;
    private String threeYearReturn;
    private String fiveYearReturn;
    private String tenYearReturn;
    private String currentYearVolatility;
    private String oneYearVolatility;
    private String threeYearVolatility;
    private String fiveYearVolatility;
    private String tenYearVolatility;
    private String currentYearNegativeVolatility;
    private String oneYearNegativeVolatility;
    private String threeYearNegativeVolatility;
    private String fiveYearNegativeVolatility;
    private String tenYearNegativeVolatility;
    private String oneYearSharpe;
    private String threeYearSharpe;
    private String fiveYearSharpe;
    private String oneYearDrawdown;
    private String threeYearDrawdown;
    private String fiveYearDrawdown;
    private String currentYearAnnualisedReturn;
    private String oneYearAnnualisedReturn;
    private String threeYearAnnualisedReturn;
    private String fiveYearAnnualisedReturn;
    private String tenYearAnnualisedReturn;

    public FinancialInstrument() {
    }

    public FinancialInstrument(String isin, String name, String currency, String class_, String sicavName, String currentYearReturn, String oneYearReturn, String threeYearReturn, String fiveYearReturn, String tenYearReturn, String currentYearVolatility, String oneYearVolatility, String threeYearVolatility, String fiveYearVolatility, String tenYearVolatility, String currentYearNegativeVolatility, String oneYearNegativeVolatility, String threeYearNegativeVolatility, String fiveYearNegativeVolatility, String tenYearNegativeVolatility, String oneYearSharpe, String threeYearSharpe, String fiveYearSharpe, String oneYearDrawdown, String threeYearDrawdown, String fiveYearDrawdown, String currentYearAnnualisedReturn, String oneYearAnnualisedReturn, String threeYearAnnualisedReturn, String fiveYearAnnualisedReturn, String tenYearAnnualisedReturn) {
        this.isin = isin;
        this.name = name;
        this.currency = currency;
        this.class_ = class_;
        this.sicavName = sicavName;
        this.currentYearReturn = currentYearReturn;
        this.oneYearReturn = oneYearReturn;
        this.threeYearReturn = threeYearReturn;
        this.fiveYearReturn = fiveYearReturn;
        this.tenYearReturn = tenYearReturn;
        this.currentYearVolatility = currentYearVolatility;
        this.oneYearVolatility = oneYearVolatility;
        this.threeYearVolatility = threeYearVolatility;
        this.fiveYearVolatility = fiveYearVolatility;
        this.tenYearVolatility = tenYearVolatility;
        this.currentYearNegativeVolatility = currentYearNegativeVolatility;
        this.oneYearNegativeVolatility = oneYearNegativeVolatility;
        this.threeYearNegativeVolatility = threeYearNegativeVolatility;
        this.fiveYearNegativeVolatility = fiveYearNegativeVolatility;
        this.tenYearNegativeVolatility = tenYearNegativeVolatility;
        this.oneYearSharpe = oneYearSharpe;
        this.threeYearSharpe = threeYearSharpe;
        this.fiveYearSharpe = fiveYearSharpe;
        this.oneYearDrawdown = oneYearDrawdown;
        this.threeYearDrawdown = threeYearDrawdown;
        this.fiveYearDrawdown = fiveYearDrawdown;
        this.currentYearAnnualisedReturn = currentYearAnnualisedReturn;
        this.oneYearAnnualisedReturn = oneYearAnnualisedReturn;
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

    public String getCurrentYearReturn() {
        return currentYearReturn;
    }

    public void setCurrentYearReturn(String currentYearReturn) {
        this.currentYearReturn = currentYearReturn;
    }

    public String getOneYearReturn() {
        return oneYearReturn;
    }

    public void setOneYearReturn(String oneYearReturn) {
        this.oneYearReturn = oneYearReturn;
    }

    public String getThreeYearReturn() {
        return threeYearReturn;
    }

    public void setThreeYearReturn(String threeYearReturn) {
        this.threeYearReturn = threeYearReturn;
    }

    public String getFiveYearReturn() {
        return fiveYearReturn;
    }

    public void setFiveYearReturn(String fiveYearReturn) {
        this.fiveYearReturn = fiveYearReturn;
    }

    public String getTenYearReturn() {
        return tenYearReturn;
    }

    public void setTenYearReturn(String tenYearReturn) {
        this.tenYearReturn = tenYearReturn;
    }

    public String getCurrentYearVolatility() {
        return currentYearVolatility;
    }

    public void setCurrentYearVolatility(String currentYearVolatility) {
        this.currentYearVolatility = currentYearVolatility;
    }

    public String getOneYearVolatility() {
        return oneYearVolatility;
    }

    public void setOneYearVolatility(String oneYearVolatility) {
        this.oneYearVolatility = oneYearVolatility;
    }

    public String getThreeYearVolatility() {
        return threeYearVolatility;
    }

    public void setThreeYearVolatility(String threeYearVolatility) {
        this.threeYearVolatility = threeYearVolatility;
    }

    public String getFiveYearVolatility() {
        return fiveYearVolatility;
    }

    public void setFiveYearVolatility(String fiveYearVolatility) {
        this.fiveYearVolatility = fiveYearVolatility;
    }

    public String getTenYearVolatility() {
        return tenYearVolatility;
    }

    public void setTenYearVolatility(String tenYearVolatility) {
        this.tenYearVolatility = tenYearVolatility;
    }

    public String getCurrentYearNegativeVolatility() {
        return currentYearNegativeVolatility;
    }

    public void setCurrentYearNegativeVolatility(String currentYearNegativeVolatility) {
        this.currentYearNegativeVolatility = currentYearNegativeVolatility;
    }

    public String getOneYearNegativeVolatility() {
        return oneYearNegativeVolatility;
    }

    public void setOneYearNegativeVolatility(String oneYearNegativeVolatility) {
        this.oneYearNegativeVolatility = oneYearNegativeVolatility;
    }

    public String getThreeYearNegativeVolatility() {
        return threeYearNegativeVolatility;
    }

    public void setThreeYearNegativeVolatility(String threeYearNegativeVolatility) {
        this.threeYearNegativeVolatility = threeYearNegativeVolatility;
    }

    public String getFiveYearNegativeVolatility() {
        return fiveYearNegativeVolatility;
    }

    public void setFiveYearNegativeVolatility(String fiveYearNegativeVolatility) {
        this.fiveYearNegativeVolatility = fiveYearNegativeVolatility;
    }

    public String getTenYearNegativeVolatility() {
        return tenYearNegativeVolatility;
    }

    public void setTenYearNegativeVolatility(String tenYearNegativeVolatility) {
        this.tenYearNegativeVolatility = tenYearNegativeVolatility;
    }

    public String getOneYearSharpe() {
        return oneYearSharpe;
    }

    public void setOneYearSharpe(String oneYearSharpe) {
        this.oneYearSharpe = oneYearSharpe;
    }

    public String getThreeYearSharpe() {
        return threeYearSharpe;
    }

    public void setThreeYearSharpe(String threeYearSharpe) {
        this.threeYearSharpe = threeYearSharpe;
    }

    public String getFiveYearSharpe() {
        return fiveYearSharpe;
    }

    public void setFiveYearSharpe(String fiveYearSharpe) {
        this.fiveYearSharpe = fiveYearSharpe;
    }

    public String getOneYearDrawdown() {
        return oneYearDrawdown;
    }

    public void setOneYearDrawdown(String oneYearDrawdown) {
        this.oneYearDrawdown = oneYearDrawdown;
    }

    public String getThreeYearDrawdown() {
        return threeYearDrawdown;
    }

    public void setThreeYearDrawdown(String threeYearDrawdown) {
        this.threeYearDrawdown = threeYearDrawdown;
    }

    public String getFiveYearDrawdown() {
        return fiveYearDrawdown;
    }

    public void setFiveYearDrawdown(String fiveYearDrawdown) {
        this.fiveYearDrawdown = fiveYearDrawdown;
    }

    public String getCurrentYearAnnualisedReturn() {
        return currentYearAnnualisedReturn;
    }

    public void setCurrentYearAnnualisedReturn(String currentYearAnnualisedReturn) {
        this.currentYearAnnualisedReturn = currentYearAnnualisedReturn;
    }

    public String getOneYearAnnualisedReturn() {
        return oneYearAnnualisedReturn;
    }

    public void setOneYearAnnualisedReturn(String oneYearAnnualisedReturn) {
        this.oneYearAnnualisedReturn = oneYearAnnualisedReturn;
    }

    public String getThreeYearAnnualisedReturn() {
        return threeYearAnnualisedReturn;
    }

    public void setThreeYearAnnualisedReturn(String threeYearAnnualisedReturn) {
        this.threeYearAnnualisedReturn = threeYearAnnualisedReturn;
    }

    public String getFiveYearAnnualisedReturn() {
        return fiveYearAnnualisedReturn;
    }

    public void setFiveYearAnnualisedReturn(String fiveYearAnnualisedReturn) {
        this.fiveYearAnnualisedReturn = fiveYearAnnualisedReturn;
    }

    public String getTenYearAnnualisedReturn() {
        return tenYearAnnualisedReturn;
    }

    public void setTenYearAnnualisedReturn(String tenYearAnnualisedReturn) {
        this.tenYearAnnualisedReturn = tenYearAnnualisedReturn;
    }

}
