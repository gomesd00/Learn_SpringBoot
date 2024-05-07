package com.upskilling.basics;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home
{
    public Home()
    {

    }

    @RequestMapping("/greet")
    public String Greet()
    {
        return "Hello, World!";
    }

    @RequestMapping("/greet/{name}")
    public String Greet(@PathVariable("name") String name)
    {
        return "Hello, " + name;
    }
}
