package com.dio.live.controller;

import com.dio.live.model.Occurrence;
import com.dio.live.service.OccurrenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/occurrence")
public class OccurrenceController {

    @Autowired
    OccurrenceService occurrenceService;

    @PostMapping()
    public Occurrence createOccurrence(@RequestBody Occurrence occurrence){
        return occurrenceService.saveOccurrence(occurrence);
    }
}
