package spring.learning.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;

@Controller
public class GreetingController {

    @RequestMapping("/")
    public String greeting(Model model) {
        model.addAttribute("student",new Student());
        return "greeting";
    }

    @RequestMapping("/hi")
    public String hi(@ModelAttribute("student") Student student) {
        System.out.println(student);
        return "hi";
    }

}