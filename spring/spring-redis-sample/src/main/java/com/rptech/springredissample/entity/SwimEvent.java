package com.rptech.springredissample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class SwimEvent implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private BigDecimal priceBRL;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPriceBRL() {
        return priceBRL;
    }

    public void setPriceBRL(BigDecimal priceBRL) {
        this.priceBRL = priceBRL;
    }

    @Override
    public String toString() {
        return "SwimEvent{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", priceBRL=" + priceBRL +
            '}';
    }
}
