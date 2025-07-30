package com.example.mdmd.repository;

import com.example.mdmd.model.PracEntity;

import java.util.List;

public interface PracRepositroy {

    void save(PracEntity pe);
    List<PracEntity> findAll();
}
