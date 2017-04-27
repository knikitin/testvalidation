package com.example.dal;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TestvalidationRepository extends CrudRepository<Testvalidation, Integer> {
    List<Testvalidation> findByName(String name);
}
