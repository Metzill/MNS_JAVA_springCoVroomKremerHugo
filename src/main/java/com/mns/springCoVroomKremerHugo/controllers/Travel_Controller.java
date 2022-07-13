package com.mns.springCoVroomKremerHugo.controllers;

import com.mns.springCoVroomKremerHugo.dao.Travel_Dao;
import com.mns.springCoVroomKremerHugo.models.Travel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Travel_Controller {

    @Autowired
    Travel_Dao travel_dao;

    @GetMapping("/travel")
    public List<Travel> getTravelPreference() {
        List<Travel> listTravel = travel_dao.findAll();
        return listTravel;
    }
}
