package com.ranjit.crud.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "todos")
@Data
public class ToDo {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status",nullable = false)
    private String status;

    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "description")
    private String description;


}