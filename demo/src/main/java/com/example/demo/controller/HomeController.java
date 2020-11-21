package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import java.util.Scanner;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String hello(){
    	// By typing 1 on the console "hello" will run, otherwise "message"
    	Scanner console = new Scanner(System.in);
    	Integer i = console.nextInt();
    	if (i==1) {
        return "hello";
    	}
    	else {
    		return "message";
    	}
    }

    @GetMapping("/message")
    public String message(Model model) {
        model.addAttribute("message", "This is a custom message");
        
        
        return "message";
    }
}