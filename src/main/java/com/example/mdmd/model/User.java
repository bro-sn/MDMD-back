package com.example.mdmd.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "userId", nullable = false, unique = true)
    private String userId;

    @Column(name = "nickname", nullable = false)
    private String nickname;

    @Column(name = "job", nullable = false)
    private String job;

    //subInfo

    @Column(name = "favoriteFood")
    private String favoriteFood;

    @Column(name = "achievementRate")
    private int achievementRate;

    @Column(name = "homeAddress")
    private String homeAddress;

    @Column(name = "plannedSleepTime")
//    @Temporal(TemporalType.TIME)
    private LocalDateTime plannedSleepTime;

    @Column(name = "wakeUpTime")
//    @Temporal(TemporalType.DATE)
    private Date wakeUpTime;

    @Column(name = "year")
    private int year;

    @Column(name = "month")
    private int month;

    @Column(name = "day")
    private int day;





}
