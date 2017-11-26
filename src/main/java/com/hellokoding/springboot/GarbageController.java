package com.hellokoding.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GarbageController {
	@RequestMapping("/garbage")
	public String garbage(Model model) {
		return "garbage";
	}
	@RequestMapping("/trash")
	public String trash(Model model) {
		return "trash";
		}
}
