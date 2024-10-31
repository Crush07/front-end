package com.hysea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin
public class IndexController {

    /**
     * http://localhost:8082/index
     * @return
     */
    @GetMapping("/index")
    public String list() {
        return "index"; // list.html
    }
}
