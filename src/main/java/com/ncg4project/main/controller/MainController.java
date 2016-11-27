package com.ncg4project.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Сергей on 27.11.2016.
 */
@Controller("/")
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mainPage(ModelMap model) {
        model.addAttribute("message", "Rope & Soap");
        return "index";
    }

    @RequestMapping(value = "/soap")
    public String soapPage(ModelMap model){
        model.addAttribute("message", "Soap");
        return "index";
    }

    @RequestMapping(value = "/rope")
    public String ropePage(ModelMap model){
        model.addAttribute("message", "Rope");
        return "index";
    }
}
