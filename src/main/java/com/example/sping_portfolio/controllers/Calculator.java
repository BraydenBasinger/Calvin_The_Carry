package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Calculator {
    @GetMapping("/Calculator")    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String Calculator(@RequestParam(name="num1", required=false, defaultValue= "0") int num1, @RequestParam(name="num2", required=false, defaultValue="0") int num2, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("result", (num1 + num2)); // MODEL is passed to html
        return "Calculator"; // returns HTML VIEW (greeting)
    }
}