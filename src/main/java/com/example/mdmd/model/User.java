package com.example.mdmd.model;

import java.sql.Time;
import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="User")
@Entity

public class User {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="userId", nullable = false)
    private String userId;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="nickname", nullable = false)
    private String nickname;

    @Column(name="job", nullable = false)
    private String job;

    @Column(nullable = false)
    private String favoriteFood;

    @Column(nullable = false)
    private int achievementRate;

    @Column(nullable = false)
    private String homeAddress;

    @Column(nullable = false)
    private LocalDateTime wakeUpTime;

    @Column(nullable = false)
    private LocalDateTime plannedSleepTime;

    @Column(nullable = false)
    private int year;

    @Column(nullable = false)
    private int month;

    @Column(nullable = false)
    private int day;

    
   
    
    

    
}
