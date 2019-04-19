package com.example.wineryclub.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "wines")
public class Wine extends BaseEntity {

    private String grapeVariety;
    private String cellar;
    private String country;
    private int year;
    private BigDecimal price;

    public Wine() {
    }
    @Column(name = "grape_variety")
    public String getGrapeVariety() {
        return grapeVariety;
    }

    public void setGrapeVariety(String grapeVariety) {
        this.grapeVariety = grapeVariety;
    }
    @Column(name = "cellar")
    public String getCellar() {
        return cellar;
    }

    public void setCellar(String cellar) {
        this.cellar = cellar;
    }
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    @Column(name = "year")
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
