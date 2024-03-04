package com.drivflow.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {
    
    @GetMapping("/")
    public String index() {
        return "/index"; // Return the name of your HTML template without the ".html" extension
    }
}
