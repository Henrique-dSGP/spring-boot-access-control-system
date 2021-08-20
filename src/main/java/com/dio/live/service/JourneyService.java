package com.dio.live.service;

import com.dio.live.model.WorkJourney;
import com.dio.live.repository.JourneyRepository;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JourneyService {

    JourneyRepository journeyRepository;

    @Autowired
    public JourneyService(JourneyRepository journeyRepository){
        this.journeyRepository = journeyRepository;
    }

    public WorkJourney saveJourney(WorkJourney workJourney){
       return journeyRepository.save(workJourney);
    }

    public WorkJourney updateJourney(WorkJourney workJourney){
        return journeyRepository.saveAndFlush(workJourney);
    }

    public List<WorkJourney> findAllWorkJourney(){
        return journeyRepository.findAll();
    }
    public Optional<WorkJourney> findWorkJourneyById(Long id){
        return journeyRepository.findById(id);
    }

    public void deleteJourney(Long id){
        journeyRepository.deleteById(id);
    }
}
