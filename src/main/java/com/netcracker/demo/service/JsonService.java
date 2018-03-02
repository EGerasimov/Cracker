package com.netcracker.demo.service;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.netcracker.demo.models.CarEntityTO;
import com.netcracker.demo.utility.UncRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service("jsonService")
public class JsonService {

    static final String ADDITION_URL = "/json";
    @Autowired
    UncRestTemplate restTemplate;

    public ObjectNode getJson() {
        ResponseEntity<ObjectNode> response = restTemplate.exchange(
                ADDITION_URL, HttpMethod.GET, ObjectNode.class);
        return response.getBody();
    }

}
