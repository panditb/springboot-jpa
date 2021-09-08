package com.example.springbackend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
}
