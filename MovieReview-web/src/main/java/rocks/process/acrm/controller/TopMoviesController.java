/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package rocks.process.acrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/Top Movies")
public class CustomerController {

    @GetMapping
    public String getCustomerView(){
        return "Top Movies.html";
    }

    @GetMapping("/createGodfather")
    public String getCustomerCreateView(){
        return "ReviewFormGodfather.html";
    }

    @GetMapping("/createIt")
    public String getCustomerCreateView(){
        return "ReviewFormIt.html";
    }
    
    @GetMapping("/createStarWars")
    public String getCustomerCreateView(){
        return "ReviewFormStarWars.html";
    }
    
    @GetMapping("/createTenet")
    public String getCustomerCreateView(){
        return "ReviewFormTenet.html";
    }
    
}
