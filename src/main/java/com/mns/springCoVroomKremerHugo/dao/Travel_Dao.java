package com.mns.springCoVroomKremerHugo.dao;

import com.mns.springCoVroomKremerHugo.models.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Travel_Dao extends JpaRepository<Travel, Integer> {
}
