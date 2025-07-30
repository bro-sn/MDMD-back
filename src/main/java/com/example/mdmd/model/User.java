package com.example.mdmd.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String userId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String job;

    private String favoriteFood;

    private int achievementRate;

    private String homeAddress;

    private LocalDateTime wakeUpTime;

    private LocalDateTime plannedSleepTime;

    private int year;

    private int month;

    private int day;


}
