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
    public String plusSign(@RequestParam(required = false, name = "num1") Integer num1, @RequestParam(required = false, name = "num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Введите параметр";
        }
        return service.plusSign(num1, num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String minusSign(@RequestParam(required = false, name = "num1") Integer num1, @RequestParam(required = false, name = "num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Введите параметр";
        }
        return service.minusSign(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiplySign(@RequestParam(required = false, name = "num1") Integer num1, @RequestParam(required = false, name = "num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Введите параметр";
        }
        return service.multiplySign(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divideSign(@RequestParam(required = false, name = "num1") Integer num1, @RequestParam(required = false, name = "num2")  Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Введите параметр";
        }
        if (num2 == 0) {
            return "Ошибка! На ноль делить нельзя!";
        }
        return service.divideSign(num1, num2);
    }
}
