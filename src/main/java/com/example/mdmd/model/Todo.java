package com.example.mdmd.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "Todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "Title",nullable = false)
    private String title;

    @Column(name = "Contents")
    private String contents;

    //기본값 지정하는 부분 추가해야함
    @Column(name = "startDate",nullable = false)
//    @Temporal(value = TemporalType.DATE)
    private Date startDate;


    //기본값 지정하는 부분 추가해야함
    @Column(name = "dueDate", nullable = false)
//    @Temporal(value = TemporalType.DATE)
    private Date dueDate;


    @Column(name = "importance", nullable = false)
    private int importance;

    //기본값 지정 필요
    @Column(name = "isCompleted", nullable = false)
    private boolean isCompleted;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "Id")
    private User user;


}
