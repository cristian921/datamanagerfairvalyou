/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.domain.node;

import com.fairvalyou.datamanger.domain.DomainObject;
import java.util.Objects;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 *
 * @author crtom
 */
@NodeEntity
public class GenericUser extends DomainObject{
    private String name;
    private String dateOfBirth;
    private String provinceOfBirth;
    private String cityOfBirth;
    private String nationOfBirth;
    private String citizenship;
    private String otherCitizenship;
    private String gender;
    private String residenceCity;
    private String residenceProvince;
    private String residenceNation;
    private String domicileCity;
    private String domicileProvince;
    private String domicileNation;
    private String qualification;
    protected String type;
    
    public GenericUser() {
        super();
        
    }

    public GenericUser(String name, String dateOfBirth, String provinceOfBirth, String cityOfBirth, String nationOfBirth, String citizenship, String otherCitizenship, String gender, String residenceCity, String residenceProvince, String residenceNation, String domicileCity, String domicileProvince, String domicileNation, String qualification) {
        super();
       
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.provinceOfBirth = provinceOfBirth;
        this.cityOfBirth = cityOfBirth;
        this.nationOfBirth = nationOfBirth;
        this.citizenship = citizenship;
        this.otherCitizenship = otherCitizenship;
        this.gender = gender;
        this.residenceCity = residenceCity;
        this.residenceProvince = residenceProvince;
        this.residenceNation = residenceNation;
        this.domicileCity = domicileCity;
        this.domicileProvince = domicileProvince;
        this.domicileNation = domicileNation;
        this.qualification = qualification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getProvinceOfBirth() {
        return provinceOfBirth;
    }

    public void setProvinceOfBirth(String provinceOfBirth) {
        this.provinceOfBirth = provinceOfBirth;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }

    public String getNationOfBirth() {
        return nationOfBirth;
    }

    public void setNationOfBirth(String nationOfBirth) {
        this.nationOfBirth = nationOfBirth;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getOtherCitizenship() {
        return otherCitizenship;
    }

    public void setOtherCitizenship(String otherCitizenship) {
        this.otherCitizenship = otherCitizenship;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getResidenceCity() {
        return residenceCity;
    }

    public void setResidenceCity(String residenceCity) {
        this.residenceCity = residenceCity;
    }

    public String getResidenceProvince() {
        return residenceProvince;
    }

    public void setResidenceProvince(String residenceProvince) {
        this.residenceProvince = residenceProvince;
    }

    public String getResidenceNation() {
        return residenceNation;
    }

    public void setResidenceNation(String residenceNation) {
        this.residenceNation = residenceNation;
    }

    public String getDomicileCity() {
        return domicileCity;
    }

    public void setDomicileCity(String domicileCity) {
        this.domicileCity = domicileCity;
    }

    public String getDomicileProvince() {
        return domicileProvince;
    }

    public void setDomicileProvince(String domicileProvince) {
        this.domicileProvince = domicileProvince;
    }

    public String getDomicileNation() {
        return domicileNation;
    }

    public void setDomicileNation(String domicileNation) {
        this.domicileNation = domicileNation;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GenericUser other = (GenericUser) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
