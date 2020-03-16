package com.notmyfault02.api.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloControllor {

    @GetMapping(value = "/helloworld/string")
    @ResponseBody
    public String helloWorldString() {
        return "Hello World";
    }

    @GetMapping(value = "/helloworld/json")
    @ResponseBody
    public Hello helloWorldJson() {
        Hello hello = new Hello();
        hello.message = "helloworld";
        return hello;
    }

    @GetMapping(value = "/helloworld/page")
    public String helloWorldPage() {
        return "helloworld";
    }

    @Getter
    @Setter
    public static class Hello {
        private String message;
    }

}