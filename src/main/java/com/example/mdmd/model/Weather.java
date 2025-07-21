package com.example.mdmd.model;

import jakarta.persistence.*;

@Entity(name = "Weather")
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

//    @Column(name = "location")

    @ManyToOne
    @JoinColumn(name = "userHomeAddress", referencedColumnName = "homeAddress")
    private User user;


}
