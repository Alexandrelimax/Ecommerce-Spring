package com.course.ecommerce.controller;

import com.course.ecommerce.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

//    @GetMapping
//    public ResponseEntity<User> findAll(){
//
//
//        return new ResponseEntity<>(u1, HttpStatus.OK);
//    }
}
