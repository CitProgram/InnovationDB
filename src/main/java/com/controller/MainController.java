package com.controller;

import com.service.OrganizationService;
import com.service.SearchService;
import com.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pc8 on 19.04.16.
 */
@Controller
public class MainController {

    @Autowired
    OrganizationService organizationService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String hello(){

        return organizationService.getAllOrganizations();
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "app/index.html";
    }


    @RequestMapping(value = "/img", method = RequestMethod.GET)
    public String img(){
        return "app/index.html";
    }



}
