package com.factory.appraisal.vehiclesearchapp.responseHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class ApiResponseHandler {
    String message;
    public static ResponseEntity<Object> generateResponse( HttpStatus status,String message) {
        Map<String, Object> map = new TreeMap<>();
        map.put("status", status.value());
        map.put("message", message);
        return new ResponseEntity<Object>(map,status);
    }
}
