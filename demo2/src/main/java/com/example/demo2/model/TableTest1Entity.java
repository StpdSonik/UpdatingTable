package com.example.demo2.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name= "tabletest1")
public class TableTest1Entity {
    @Id
    @Column(name = "id", nullable = true)
    private Long id;
    @Basic
    @Column(name = "name", nullable = true, length = -1)
    private String name;
    @Basic
    @Column(name = "lastname", nullable = true, length = -1)
    private String lastname;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
}
