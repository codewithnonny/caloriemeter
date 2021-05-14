package com.codewithnonny.caloriemeter.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double speed;
    private int time;
    private Double calorie;

    @Temporal(TemporalType.DATE)
    private Date date = new Date(System.currentTimeMillis());


    public Date getDate() {
        return date;
    }

    @JsonBackReference
    @ManyToOne
    private User user;

    public Exercise() {
    }

    public Exercise(Long id, String name, Double speed, int time, Double calorie, User user) {
        this.id = id;
        this.name = name;
        this.speed = speed;
        this.time = time;
        this.calorie = calorie;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Double getCalorie() {
        return calorie;
    }

    public void setCalorie(Double calorie) {
        calorie=calorie*2;
        this.calorie = calorie;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
