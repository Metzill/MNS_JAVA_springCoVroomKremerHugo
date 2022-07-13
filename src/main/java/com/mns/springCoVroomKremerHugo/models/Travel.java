package com.mns.springCoVroomKremerHugo.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Inheritance(strategy = InheritanceType.JOINED)
public class Travel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToMany
    private List<Seat> seats;

    @ManyToMany
    private List<Travel_Preference> travel_preferences;
    
    private Integer seat_at_beginning;
    
    private float start_latitude;
    
    private float start_longitude;
    
    private Date start_time;
    
    private float end_latitude;

    private float end_longitude;
    
    private Date end_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeat_at_beginning() {
        return seat_at_beginning;
    }

    public void setSeat_at_beginning(Integer seat_at_beginning) {
        this.seat_at_beginning = seat_at_beginning;
    }

    public float getStart_latitude() {
        return start_latitude;
    }

    public void setStart_latitude(float start_latitude) {
        this.start_latitude = start_latitude;
    }

    public float getStart_longitude() {
        return start_longitude;
    }

    public void setStart_longitude(float start_longitude) {
        this.start_longitude = start_longitude;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public float getEnd_latitude() {
        return end_latitude;
    }

    public void setEnd_latitude(float end_latitude) {
        this.end_latitude = end_latitude;
    }

    public float getEnd_longitude() {
        return end_longitude;
    }

    public void setEnd_longitude(float end_longitude) {
        this.end_longitude = end_longitude;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public List<Travel_Preference> getTravel_preferences() {
        return travel_preferences;
    }

    public void setTravel_preferences(List<Travel_Preference> travel_preferences) {
        this.travel_preferences = travel_preferences;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
