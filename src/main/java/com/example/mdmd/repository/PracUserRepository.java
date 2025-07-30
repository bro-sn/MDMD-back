package com.example.mdmd.repository;

import com.example.mdmd.model.PracUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PracUserRepository extends JpaRepository<PracUser, Long> {
    PracUser findByUserIdAndPassword(String userId, String password);
}
