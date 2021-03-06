package com.netcracker.demo.controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.netcracker.demo.service.JsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class JsonController {
    @Autowired
    JsonService jsonService;

    @RequestMapping(value = "/allDriversJson", method = RequestMethod.GET)
    @ResponseBody
    public ObjectNode getAllDriversJson(HttpServletRequest req, HttpServletResponse res) {
        ObjectNode objectNode = jsonService.getAllDriversJson(req, res);
        return objectNode;
    }

    @RequestMapping(value = "/availableDriversJson", method = RequestMethod.GET)
    @ResponseBody
    public ObjectNode getAvailableDriversJson(HttpServletRequest req, HttpServletResponse res) {
        ObjectNode objectNode = jsonService.getAvailableDriversJson(req, res);
        return objectNode;
    }
}
