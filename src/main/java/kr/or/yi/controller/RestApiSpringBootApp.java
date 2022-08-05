package kr.or.yi.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
@RestController
public class RestApiSpringBootApp {

    @GetMapping("/helloWorld/string")
    @ResponseBody
    public String helloWorldString() {
        return "hello";
    }

    @GetMapping("/helloWorld/json")
    @ResponseBody
    public Hello helloWorldJson() {
        Hello hello = new Hello();
        hello.setMessage("Hello");
        return hello;
    }

    @Getter
    @Setter
    public static class Hello {
        private String message;
    }

    @GetMapping("/helloWorld/page")
    public String HelloWorldPage() {
        return "helloWorld";
    }
}
