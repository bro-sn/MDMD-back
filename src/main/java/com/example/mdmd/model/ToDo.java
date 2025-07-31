package com.example.mdmd.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
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
    private LocalDateTime startDate;

    @Column(nullable = false)
    private LocalDateTime DueDate;

    @Column(nullable = false)
    private int importance;

    @Column (nullable = false)
    private boolean isCompleted;


    
}
