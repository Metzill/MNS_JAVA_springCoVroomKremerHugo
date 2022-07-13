package com.mns.springCoVroomKremerHugo.dao;

import com.mns.springCoVroomKremerHugo.models.Travel_Preference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Travel_Preference_Dao extends JpaRepository<Travel_Preference, Integer> {
}
