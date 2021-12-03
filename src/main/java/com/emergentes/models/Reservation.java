package com.emergentes.models;

import java.sql.Date;

public class Reservation {
    private int id;
    private int user_id;
    private int hour_id;
    private String reservation_date;

    public Reservation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getHour_id() {
        return hour_id;
    }

    public void setHour_id(int hour_id) {
        this.hour_id = hour_id;
    }

    public String getReservation_date() {
        return reservation_date;
    }

    public void setReservation_date(String reservation_date) {
        this.reservation_date = reservation_date;
    }    
}
