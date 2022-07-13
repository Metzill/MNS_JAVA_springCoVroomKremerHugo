package com.mns.springCoVroomKremerHugo.dao;

import com.mns.springCoVroomKremerHugo.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Seat_Dao extends JpaRepository<Seat, Integer> {
}
