package co.develhope.java10.helloproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Value("${hello.name}")
    private String name;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello! My name is " + name;
    }
}
