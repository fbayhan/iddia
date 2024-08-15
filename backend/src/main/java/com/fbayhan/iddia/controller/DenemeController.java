package com.fbayhan.iddia.controller;

import com.fbayhan.iddia.service.DenemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DenemeController {

    @Autowired
    DenemeService denemeService;

    @GetMapping(value = "/tahsin")
    public Boolean insert() {
        denemeService.firstInsert();
        return true;
    }
}
