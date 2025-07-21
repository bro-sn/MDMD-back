package com.example.mdmd.model;

import jakarta.persistence.*;
import jdk.jfr.Relational;
import lombok.Cleanup;

import java.util.Date;

@Entity(name = "UserFeedBack")
public class UserFeedBack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "FeedBack",nullable = false)
    private String feedBack;

    @Column(name = "Memo")
    private String memo;

    @Column(name = "Date", nullable = false)
//    @Temporal(TemporalType.DATE)
    private Date date;


    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "Id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "todoId",referencedColumnName = "Id")
    private Todo todo;

}
