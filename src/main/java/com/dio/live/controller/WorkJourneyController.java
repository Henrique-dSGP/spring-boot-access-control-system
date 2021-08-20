package com.dio.live.controller;

import com.dio.live.model.WorkJourney;
import com.dio.live.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/journey")
public class WorkJourneyController {

    @Autowired
    JourneyService journeyService;

    @PostMapping()
    public WorkJourney createWorkJourney(@RequestBody WorkJourney workJourney){
        return journeyService.saveJourney(workJourney);
    }
    @GetMapping()
    public List<WorkJourney> getAllWorkJourney(){
        return journeyService.findAllWorkJourney();
    }
    @GetMapping("/{idJourney}")
    public ResponseEntity<WorkJourney> getWorkJourneyById(@PathVariable("idJourney") Long id) throws NoSuchElementException{
        return ResponseEntity.ok(journeyService.findWorkJourneyById(id).orElseThrow(() -> new NoSuchElementException("Work Journey Not Find")));
    }
    @PutMapping
    public WorkJourney updateWorkJourney(@RequestBody WorkJourney workJourney){
        return journeyService.updateJourney(workJourney);
    }
}
