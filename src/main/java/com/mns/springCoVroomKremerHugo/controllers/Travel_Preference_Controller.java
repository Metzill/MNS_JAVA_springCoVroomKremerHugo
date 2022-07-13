package com.mns.springCoVroomKremerHugo.controllers;

import com.mns.springCoVroomKremerHugo.dao.Travel_Preference_Dao;
import com.mns.springCoVroomKremerHugo.models.Travel_Preference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Travel_Preference_Controller {

    @Autowired
    Travel_Preference_Dao travel_preference_dao;

    @GetMapping("/travel-preference")
    public List<Travel_Preference> getTravelPreference() {
        List<Travel_Preference> listTravelPreference = travel_preference_dao.findAll();
        return listTravelPreference;
    }

    @GetMapping("/travel-preference/{id}")
    public ResponseEntity<Travel_Preference> getTravelPreferenceById(@PathVariable Integer id) {

        Optional<Travel_Preference> travel_preference = travel_preference_dao.findById(id);

        if(travel_preference.isPresent()){
            return ResponseEntity.ok(travel_preference.get());
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping("/travel-preference")
    public ResponseEntity<Travel_Preference> createTravelPreference(@RequestBody Travel_Preference travel_preference){
        travel_preference_dao.save(travel_preference);

        return ResponseEntity.status(HttpStatus.CREATED).body(travel_preference);
    }
}
