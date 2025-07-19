package com.example.mdmd;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name="ToDo")

public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Todo_id")
    private Long id;


    //제목
    @Column(name="Title", nullable = false)
    private String title;

    //내용
    @Column(name="Contents", nullable = true)   //nullable 꼭 적어줘야 하나요?
    private String contents;

    //마감일
    @Column(name="DueDate", nullable = false)
    private LocalDate duedate;

    //시작일
    @Column(name="StartDate", nullable = false)
    private LocalDate startdate;

    //중요도
    @Column(name="Importance", nullable = false)
    private int importance;

    //완료?
    @Column(name="IsCompleted", nullable = true)
    private boolean isCompleted;

    //id?
    @Column(name="Id", nullable = false)
    private int id;



}