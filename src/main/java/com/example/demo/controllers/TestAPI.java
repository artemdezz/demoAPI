package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "192.168.11.00:27015", allowedHeaders = "*")
public class TestAPI {

    @GetMapping("http://amazom.web/artem/fullname1")
    public String getFullname1(){

        return "Аня";
    }



    @DeleteMapping("/fullname2")
    public String getFullname3(Json json){
        String msg = "Hello" + json.getClass();

        return msg;
    }

    @GetMapping("/fullname3/{name}")
    public String getFullname4(@PathVariable String name){
        return "Аня Петрова3 + "+name;
    }


}







//@RequestMapping("/client")
//localhost/client/fullname
/*    @GetMapping("/fullname")
    public String getClientsFullName() {
        return "Аня";
    }

    @GetMapping("/fullname1")
    public String getClientsFullName1() {
        return "Коля";
    }

    @GetMapping("/fullname2")
    public String getClientsFullName2() {
        return "Петя";
    }

    @GetMapping("/govno123457")
    public String getClientsFullName3() {
        return "Петя"+" Аня";
    }*/
