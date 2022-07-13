package com.mns.springCoVroomKremerHugo.controllers;

import com.mns.springCoVroomKremerHugo.dao.Seat_Dao;
import com.mns.springCoVroomKremerHugo.models.Seat;
import com.mns.springCoVroomKremerHugo.models.Travel_Preference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Seat_Controller {

    @Autowired
    Seat_Dao seat_dao;

    @GetMapping("/seat")
    public List<Seat> getTravelPreference() {
        List<Seat> listSeat = seat_dao.findAll();
        return listSeat;
    }
}
