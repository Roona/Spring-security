package com.springsec.oauth.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecureController {

    @GetMapping("/getuser")
    public String main(@AuthenticationPrincipal OidcUser user) {
        System.out.println(user.getFullName());
        return "secure.html";
    }
    @GetMapping("/getuser1")
    public String main1(@AuthenticationPrincipal OidcUser user) {
        System.out.println(user.getFullName());
        return user.getFullName();
    }
}
