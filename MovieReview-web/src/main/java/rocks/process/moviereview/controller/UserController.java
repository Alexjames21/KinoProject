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
import rocks.process.moviereview.business.service.AgentService;
import rocks.process.moviereview.data.domain.Agent;

@Controller
public class UserController {

    @Autowired
    private AgentService agentService;

    @GetMapping("/register")
    public String getRegisterView() {
        return "register.html";
    }

    @PostMapping("/register")
    public ResponseEntity<Void> postRegister(@RequestBody Agent agent) {
        try {
            agentService.saveAgent(agent);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/error")
    public String getRegisterView() {
        return "403.html";
    }

    @GetMapping("/homesignedin")
    public String getRegisterView() {
        return "home_signed_in.html";
    }

    @GetMapping("/home")
    public String getRegisterView() {
        return "home.html";
    }

    @GetMapping("/aboutsignedin")
    public String getRegisterView() {
        return "about_signed_in.html";
    }

    @GetMapping("/about")
    public String getRegisterView() {
        return "about.html";
    }

    @GetMapping("/logout")
    public String getRegisterView() {
        return "home.html";
    }


    @GetMapping("/changepassword")
    public String getRegisterView() {
        return "change_password.html";
    }
}