package com.example.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }
    @GetMapping
    public String hello() {
        return service.hello();
    }
    @GetMapping(path = "/calculator")
    public String calculator() {
        return service.calculator();
    }
    @GetMapping(path = "/calculator/plus")
    public String plusSign(@RequestParam("num1") int num1, @RequestParam ("num2") int num2) {
        return service.plusSign(num1, num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String minusSign(@RequestParam("num1") int num1, @RequestParam ("num2") int num2) {
        return service.minusSign(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiplySign(@RequestParam("num1") int num1, @RequestParam ("num2") int num2) {
        return service.multiplySign(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divideSign(@RequestParam("num1") int num1, @RequestParam ("num2") int num2) {
        return service.divideSign(num1, num2);
    }
}
