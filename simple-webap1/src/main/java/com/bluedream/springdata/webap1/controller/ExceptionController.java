package com.bluedream.springdata.webap1.controller;

import com.bluedream.springdata.webap1.exception.ApiException;
import com.bluedream.springdata.webap1.exception.MyNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/exception")
public class ExceptionController {
    @RequestMapping(value = "/404", method = RequestMethod.GET)
    public ResponseEntity<Map<String, String>> notFound() throws MyNotFoundException {
        throw new MyNotFoundException();
    }

    @RequestMapping(value = "/400", method = RequestMethod.GET)
    public ResponseEntity<Map<String, String>> badRequest() throws ApiException {
        throw new ApiException("default");
    }

    @RequestMapping(value = "/500", method = RequestMethod.GET)
    public ResponseEntity<Map<String, String>> ise() throws Exception {
        throw new Exception();
    }
}
