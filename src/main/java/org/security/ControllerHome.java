package org.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHome {
    @GetMapping("/")
    public String home(){
            return ("<h1>Welcome<h2>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h1>Welcome User<h2>");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Welcome Admin<h2>");
    }
}
