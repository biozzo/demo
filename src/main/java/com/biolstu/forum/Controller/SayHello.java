package com.biolstu.forum.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SayHello {

    @GetMapping("/hello1")
    public String sayHello(@RequestParam(name = "name") String name , Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
