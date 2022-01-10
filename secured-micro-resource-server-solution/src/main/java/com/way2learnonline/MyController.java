package com.way2learnonline;

import java.security.Principal;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	   @RequestMapping("/securedPage")
	    public String securedPage(Model model, Principal principal) {
	        return "securedPage";
	    }

	    @RequestMapping("/")
	    public String index(Model model, Principal principal) {
	        return "index";
	    }
}
