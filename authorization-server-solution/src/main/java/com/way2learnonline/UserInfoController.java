package com.way2learnonline;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserInfoController {
	
	  @GetMapping("/validateUser")
	    public Principal user(Principal principal) {
	        return principal;
	    }
	

}
