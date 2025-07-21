package com.example.mdmd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity(name = "Table_Food")
@Data
public class Food {
    @Id
    private String id;

    private int budget;


}