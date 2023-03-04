package com.credibanco.assessment.card.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Card {

    @Id
    private Long id;
    @Column(unique=true)
    private Long PAN;
    private String state;
    private String type;
    private int validationNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPAN() {
        return PAN;
    }

    public void setPAN(Long PAN) {
        this.PAN = PAN;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getValidationNumber() {
        return validationNumber;
    }

    public void setValidationNumber(int validationNumber) {
        this.validationNumber = validationNumber;
    }
}
