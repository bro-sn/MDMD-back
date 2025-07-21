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
    @Column(name="ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(name="userId", nullable = false)
    private String userId;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="nickname", nullable = false)
    private String nickname;

    @Column(name="job", nullable = false)
    private String job;

    @Column
    private String favoriteFood;

    @Column
    private int achievementRate;

    @Column
    private String homeAddress;

    @Column
    private LocalDateTime wakeUpTime;

    @Column
    private LocalDateTime plannedSleepTime;

    @Column
    private int year;

    @Column
    private int month;

    @Column
    private int day;

    
   
    
    

    
}
