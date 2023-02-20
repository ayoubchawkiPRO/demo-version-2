package com.example.demoversion2.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class Version {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String platform;
    private String version;

    // getters and setters
}

