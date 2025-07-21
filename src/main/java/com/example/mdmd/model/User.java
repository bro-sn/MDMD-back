package com.example.mdmd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity(name = "Table_User")
@Data
public class User {
    @Id
    private Long id;

    @Column(nullable = false)
    private String userid;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String job;

    private int achievementRate;
    private String homeAddress;
    private LocalDateTime wakeUpTime;
    private LocalDateTime plannedSleepTime;
    private int year;
    private int month;
    private int day;


}