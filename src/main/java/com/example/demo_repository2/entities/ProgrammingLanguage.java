package com.example.demo_repository2.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Programming_Language")
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private Integer firstAppearence;

    @Column(nullable = false)
    private String inventor;

    public ProgrammingLanguage() {}

    public ProgrammingLanguage(Integer id, String name, Integer firstAppearence, String inventor) {
        this.id = id;
        this.name = name;
        this.firstAppearence = firstAppearence;
        this.inventor = inventor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFirstAppearence() {
        return firstAppearence;
    }

    public void setFirstAppearence(Integer firstAppearence) {
        this.firstAppearence = firstAppearence;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}
