/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aditya.course.api.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    
    //The @RequestMapping maps only to the GET method by default .TO map to oher HTTP method ,we'll have to specigy it in the annotation
    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    } 
}
