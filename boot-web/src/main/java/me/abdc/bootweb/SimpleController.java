package me.abdc.bootweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Boot!!";
    }

    @GetMapping("/simple")
    public String simple() {
        return "Hello, Simple!!";
    }
}
