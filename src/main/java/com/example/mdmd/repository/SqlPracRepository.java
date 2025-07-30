package com.example.mdmd.repository;

import com.example.mdmd.model.PracEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqlPracRepository implements PracRepositroy {

    //sql로 어떻게 연결하고 저장하지???????
    //sql내 데이터 저장, 조회는 안했던거같은데

    @Override
    public void save(PracEntity pe) {


    }

    @Override
    public List<PracEntity> findAll() {
        return List.of();
    }
}
