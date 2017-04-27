package com.example.web;

import com.example.dal.Testvalidation;
import com.example.dal.TestvalidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test/")
public class TestvalidationController {

    @Autowired
    TestvalidationService testvalidationService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Testvalidation> findTestvalidation(){
        return testvalidationService.findAll();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Testvalidation postTestvalidation( @RequestBody Testvalidation inserted){
        return testvalidationService.save(inserted);
    }

}
