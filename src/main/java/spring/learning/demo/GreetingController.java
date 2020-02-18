package spring.learning.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import javax.validation.Valid;

@Controller
public class GreetingController {

    @RequestMapping("/")
    public String greeting(Model model) {
        model.addAttribute("student", new Student());
        return "greeting";
    }

    @RequestMapping("/hi")
    public String hi(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "greeting";
        else
            return "hi";
    }

}