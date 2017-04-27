package com.example.dal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class TestvalidationService {

    @Autowired
    TestvalidationRepository testvalidationRepository;

    public Iterable<Testvalidation> findAll(){
        return testvalidationRepository.findAll();
    }

    public Testvalidation save(Testvalidation inserted){
        return testvalidationRepository.save(inserted);
    }


}
