package com.account.email.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompanyInfo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String symbol;
    
    private String about;//Small summary of company.
    private String CEO;
    private Long employees;
    private String founded;//Day the company started
    private String headQuarters; //Company location


    public CompanyInfo() {
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getCEO() {
        return CEO;
    }

    public void setCEO(String CEO) {
        this.CEO = CEO;
    }

    public Long getEmployees() {
        return employees;
    }

    public void setEmployees(Long employees) {
        this.employees = employees;
    }

    public String getFounded() {
        return founded;
    }

    public void setFounded(String founded) {
        this.founded = founded;
    }

    public String getHeadQuarters() {
        return headQuarters;
    }

    public void setHeadQuarters(String headQuarters) {
        this.headQuarters = headQuarters;
    }

    @Override
    public String toString() {
        return "CompanyInfo{" +
                "symbol='" + symbol + '\'' +
                ", about='" + about + '\'' +
                ", CEO='" + CEO + '\'' +
                ", employees=" + employees +
                ", founded='" + founded + '\'' +
                ", headQuarters='" + headQuarters + '\'' +
                '}';
    }
}
