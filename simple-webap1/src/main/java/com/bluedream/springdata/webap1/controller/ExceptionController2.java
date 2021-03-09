package com.bluedream.springdata.webap1.controller;

import com.bluedream.springdata.webap1.exception.ApiException;
import com.bluedream.springdata.webap1.exception.MyNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/exception2",
        consumes = MediaType.ALL_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class ExceptionController2 {
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<String> get(@PathVariable int id) throws ApiException {
        //Optional<> delivery = deliveryRepository.findById(id);
        if (id == 1) {
            throw new MyNotFoundException("1");
        }
        return new ResponseEntity<>("Input: " + id, HttpStatus.OK);
    }
}
