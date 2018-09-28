package com.justanotherprogrammerhere.project1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.justanotherprogrammerhere.project1.model.UserDetails;
import com.justanotherprogrammerhere.project1.service.UserService;

@Controller
public class UserController {

   @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    //public ResponseEntity<List<UserDetails>> userDetails() {
    public ResponseEntity<String> userDetails() {

        List<UserDetails> userDetails = userService.getUserDetails();
        System.out.println("Inside the controller testing");
        return new ResponseEntity<>(userDetails.toString(), HttpStatus.OK);
        //return new ResponseEntity<>("Success",HttpStatus.OK);
    }

}
