package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExplainController {
    
	@GetMapping("/explain")
    public String explain() {
        return "explain";
    }
}
