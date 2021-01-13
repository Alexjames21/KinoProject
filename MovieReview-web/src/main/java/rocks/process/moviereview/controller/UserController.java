/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package rocks.process.moviereview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
//import rocks.process.moviereview.business.service.LoginService;
//import rocks.process.moviereview.data.domain.User;

@Controller
public class UserController {

    //@Autowired
    //private LoginService agentService;

    @GetMapping("/register")
    public String getRegisterView() {
        return "register.html";
    }

    //@PostMapping("/register")
    //public ResponseEntity<Void> postRegister(@RequestBody User agent) {
      //  try {
        //    agentService.saveUser(user);
   //     } catch (Exception e) {
    //        throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
    //    }
    //    return ResponseEntity.ok().build();
   // }

    @GetMapping("/error403")
    public String getErrorView() {
        return "403.html";
    }

    @GetMapping("/homesignedin")
    public String getHomeSignedInView() {
        return "home_signed_in.html";
    }

    @GetMapping("/home")
    public String getHomeView() {
        return "home.html";
    }

    @GetMapping("/aboutsignedin")
    public String getAboutSignedInView() {
        return "about_signed_in.html";
    }

    @GetMapping("/about")
    public String getAboutView() {
        return "about.html";
    }

    @GetMapping("/logout")
    public String getLogOutView() {
        return "home.html";
    }


    @GetMapping("/changepassword")
    public String getChangePasswordView() {
        return "change_password.html";
    }
}