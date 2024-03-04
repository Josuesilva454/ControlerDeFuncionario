package com.job.demo.jobalexa.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "official_id")
    @JsonBackReference
    private Official officials;

    // Construtores, getters e setters

    public Company() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    // Construtor com parâmetros, getters e setters
    public Company(String name) {
        this.name = name;
    }

    // Getter e setter para officials

    public Official getOfficials() {
        return officials;
    }

    public void setOfficials(Official officials) {
        this.officials = officials;
    }
}



