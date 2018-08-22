package com.pearl.spring.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
public class Country {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer Id;

    @Column(nullable = false)
    private String name;

}