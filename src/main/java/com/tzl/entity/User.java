package com.tzl.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "user_name",length = 50)
    String userName;

    @Column
    String email;
}
