package com.example.projectapplication.entities;

import javax.persistence.*;

@Entity
public class Tax {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer taxLevel;

    public Tax(){}

    public Tax(Integer taxLevel) {
        this.taxLevel = taxLevel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTaxLevel() {
        return taxLevel;
    }

    public void setTaxLevel(Integer taxLevel) {
        this.taxLevel = taxLevel;
    }

    @Override
    public String toString() {
        return "Tax{" +
                "id=" + id +
                ", taxLevel='" + taxLevel + '\'' +
                '}';
    }
}
