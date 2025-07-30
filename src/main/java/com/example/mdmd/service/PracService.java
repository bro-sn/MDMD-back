package com.example.mdmd.service;

import com.example.mdmd.model.PracEntity;
import com.example.mdmd.repository.PracRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PracService {
    PracRepositroy pracRepositroy;

    @Autowired
    public PracService(PracRepositroy pracRepositroy) {
        this.pracRepositroy = pracRepositroy;
    }

    public void save(PracEntity pe){
        pracRepositroy.save(pe);

    }

}
