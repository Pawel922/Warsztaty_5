package pl.coderslab.warsztaty_5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping("/hello")
    public String hello(){
        return "Witaj na 5 warsztacie";
    }
}