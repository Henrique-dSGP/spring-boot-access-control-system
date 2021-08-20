package com.dio.live.service;

import com.dio.live.model.AccessLevel;
import com.dio.live.repository.AccLvlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccLvlService {

    AccLvlRepository accLvlRepository;

    @Autowired
    public AccLvlService(AccLvlRepository accLvlRepository){
        this.accLvlRepository = accLvlRepository;
    }
    public AccessLevel saveAccLvl(AccessLevel accessLevel){
        return accLvlRepository.save(accessLevel);
    }
}
