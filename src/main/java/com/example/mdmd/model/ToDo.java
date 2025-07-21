package com.example.mdmd.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity(name = "Table_ToDo")
@Data
public class ToDo {
    @Id
    private Long id;

    @Column(nullable = false)
    private String Title;

    private String Contents;

    @Column(nullable = false)
    private LocalDateTime startDate;

    @Column(nullable = false)
    private LocalDateTime DueDate;

    private int importance;

    @Column(nullable = false)
    private boolean isCompleted;


}