package com.example.dal;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Data
@Entity
@Table(name = "testvalidation")
@Accessors(chain = true)
public class Testvalidation {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name="my_seq", sequenceName="testvalidation_id_seq")
    @GeneratedValue(strategy=SEQUENCE, generator="my_seq")
    private Integer id;
    private String description;
    private String tenant;
    private String name;
    private String email;
}
