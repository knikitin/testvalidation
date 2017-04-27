package com.example.dal;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Entity
@Table(name = "testvalidation")
@Accessors(chain = true)
public class Testvalidation {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private String tenant;
    private String name;
    private String email;
}
