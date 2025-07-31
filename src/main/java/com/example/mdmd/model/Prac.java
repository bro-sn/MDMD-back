package com.example.mdmd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Prac")
public class Prac {
    @Id
    @Column(name="ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(nullable = false)
    private String Name;

    @Column
    private int Age;

    @Column
    private String Job;

    @Column
    private String Phone;

    
}

