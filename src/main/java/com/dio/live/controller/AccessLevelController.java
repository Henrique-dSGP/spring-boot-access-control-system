package com.dio.live.controller;

import com.dio.live.model.AccessLevel;
import com.dio.live.repository.AccLvlRepository;
import com.dio.live.service.AccLvlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/access-level")
public class AccessLevelController {

    @Autowired
    AccLvlService accLvlService;

    @PostMapping()
    public AccessLevel createAccessLevel(@RequestBody AccessLevel accessLevel){
        return accLvlService.saveAccLvl(accessLevel);
    }
}
