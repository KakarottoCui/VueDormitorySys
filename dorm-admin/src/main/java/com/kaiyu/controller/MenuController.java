package com.kaiyu.controller;

import com.kaiyu.entity.Menu;
import com.kaiyu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/menu")
    public List<Menu> getMenuListByUserId() {
        return menuService.getMenusByUserId();
    }
}
