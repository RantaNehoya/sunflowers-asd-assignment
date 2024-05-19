package com.nehoya.asdassignment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j
public class HomeController {

    @GetMapping("/")
    String homepage (Model model){
        log.info("loading index page");
        return "index";
    }
}
