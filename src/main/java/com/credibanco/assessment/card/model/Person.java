package com.credibanco.assessment.card.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {

    @Id
    private Long id;
    private String name;
    private String cedula;
    private String phone;

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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
