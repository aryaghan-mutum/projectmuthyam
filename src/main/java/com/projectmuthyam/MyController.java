package com.projectmuthyam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcomeMsg() {
        return "welcome to my HOME page!";
    }

    @RequestMapping(value = "/welcome2", method = RequestMethod.GET)
    public String welcomeMsg2() {
        return "welcome to my ABOUT page 2!";
    }

    @RequestMapping(value = "/getUser", method = {RequestMethod.GET, RequestMethod.POST})
    public String getUser(@RequestParam(value = "myName") String name) {

        return "Welcome " + name;
    }
}
