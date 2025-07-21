package com.example.mdmd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ToDO")


public class ToDo {
    @Id
    @Column(name="ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(nullable = false)
    private String Title;

    @Column
    private String Contents;

    @Column(nullable = false)
    private date startDate;

    @Column(nullable = false)
    private date DueDate;

    @Column(nullable = false)
    private int importance;

    @Column
    private boolean isCompleted;

    
}
