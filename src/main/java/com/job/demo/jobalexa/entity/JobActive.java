package com.job.demo.jobalexa.entity;


import jakarta.persistence.*;

@Entity
public class JobActive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String active;
    @OneToOne
    @JoinColumn(name = "official_id")
    private Official job;

    private JobActive(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
