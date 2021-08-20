package com.dio.live.service;

import com.dio.live.model.UserCategory;
import com.dio.live.repository.UsrCatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsrCatService {

    UsrCatRepository usrCatRepository;

    @Autowired
    public UsrCatService(UsrCatRepository usrCatRepository){
        this.usrCatRepository = usrCatRepository;
    }
    public UserCategory saveUsrCat(UserCategory userCategory){
        return usrCatRepository.save(userCategory);
    }
}
