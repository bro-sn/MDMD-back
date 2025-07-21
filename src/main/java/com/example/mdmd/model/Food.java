package com.example.mdmd.model;

import jakarta.persistence.*;

@Entity(name = "Food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "budget")
    private int bugget;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "Id")
    private User user;

    //@Column(name = "foodName", nullable = false)

}
