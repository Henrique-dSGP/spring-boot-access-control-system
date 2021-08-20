package com.dio.live.service;

import com.dio.live.model.Occurrence;
import com.dio.live.repository.OccurrenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OccurrenceService {
    OccurrenceRepository occurrenceRepository;

    @Autowired
    public OccurrenceService(OccurrenceRepository occurrenceRepository){
        this.occurrenceRepository = occurrenceRepository;
    }
    public Occurrence saveOccurrence(Occurrence occurrence){
        return occurrenceRepository.save(occurrence);
    }
}
