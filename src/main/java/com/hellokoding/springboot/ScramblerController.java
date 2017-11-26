package com.hellokoding.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ScramblerController {
	@Autowired
	ScramblerService scrambler;
	
	@RequestMapping("/scramble")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="NAME") String name) {
        model.addAttribute("name", scrambler.scramble(name));
        return "scramble";
    }
}
