package com.example.mdmd;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mdmd.model.Prac;

public interface PracRepository0731 extends JpaRepository<Prac, Integer> {

    Prac save(PracRepository0731 pr);
    
}