/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.domain.node;


import com.fairvalyou.datamanger.domain.DomainObject;
import com.fairvalyou.datamanger.relationship.ParentOf;
import java.util.HashSet;
import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;


/**
 *
 * @author crtom
 */
@NodeEntity(label = "User")
public class User extends DomainObject {

    @Property(name = "name")
    private String name;
    @Property(name = "date of birth")
    private String dateOfBirth;
    @Property(name = "province of birth")
    private String provinceOfBirth;
    @Property(name = "city of birth")
    private String cityOfBirth;
    @Property(name = "nation of birth")
    private String nationOfBirth;
    @Property(name = "citizenship")
    private String citizenship;
    @Property(name = "other citizenship")
    private String otherCitizenship;
    @Property(name = "gender")
    private String gender;
    @Property(name = "residence city")
    private String residenceCity;
    @Property(name = "residence province")
    private String residenceProvince;
    @Property(name = "residence nation")
    private String residenceNation;
    @Property(name = "domicile city")
    private String domicileCity;
    @Property(name = "domicile province")
    private String domicileProvince;
    @Property(name = "domicile nation")
    private String domicileNation;
    @Property(name = "qualification")
    private String qualification;
    
    @Relationship(type = "PARENT_OF", direction = Relationship.OUTGOING)
    private Set<ParentOf> sons;

    @Relationship(type = "PARENT_OF", direction = Relationship.INCOMING)
    private Set<ParentOf> parents;
    
    public User() {
        super();
        
    }

    public User(String name, String dateOfBirth, String provinceOfBirth, String cityOfBirth, String nationOfBirth, String citizenship, String otherCitizenship, String gender, String residenceCity, String residenceProvince, String residenceNation, String domicileCity, String domicileProvince, String domicileNation, String qualification) {
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
    
    public void addSon(ParentOf parentOf){
        if(sons == null)
            sons = new HashSet<>();
        sons.add(parentOf);
    }
    
     public void addParent(ParentOf parentOf){
        if(sons == null)
            parents = new HashSet<>();
        parents.add(parentOf);
    }
}
