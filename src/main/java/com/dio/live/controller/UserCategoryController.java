package com.dio.live.controller;

import com.dio.live.model.AccessLevel;
import com.dio.live.model.UserCategory;
import com.dio.live.service.AccLvlService;
import com.dio.live.service.UsrCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-category")
public class UserCategoryController {

    @Autowired
    UsrCatService usrCatService;

    @PostMapping()
    public UserCategory createUserCategory(@RequestBody UserCategory userCategory){
        return usrCatService.saveUsrCat(userCategory);
    }
}
