package com.projectmuthyam.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/examples/v1/users")
public class UserController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcomeMsg() {
        return "welcome to my HOME page!";
    }

    @RequestMapping(value = "/welcome2", method = RequestMethod.GET)
    public String welcomeMsg2() {
        return "welcome to my ABOUT page 2!";
    }

    @RequestMapping(value = "", method = {RequestMethod.GET})
    public List getUserName() {
        Map usersMap = new HashMap<>();
        usersMap.put("Name1", "Anura");
        usersMap.put("Name2", "Rag");
        usersMap.put("Name3", "Sang");

        List usersList = new ArrayList<>();
        usersList.add(usersMap);

        return usersList;
    }
}
