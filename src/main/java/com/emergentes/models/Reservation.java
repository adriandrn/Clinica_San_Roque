package com.emergentes.models;

import java.sql.Date;

public class Reservation {
    private int id;
    private int user_id;
    private int houor_id;
    private Date reservation_date;
    private String reservation_hour;

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

    public int getHouor_id() {
        return houor_id;
    }

    public void setHouor_id(int houor_id) {
        this.houor_id = houor_id;
    }

    public Date getReservation_date() {
        return reservation_date;
    }

    public void setReservation_date(Date reservation_date) {
        this.reservation_date = reservation_date;
    }

    public String getReservation_hour() {
        return reservation_hour;
    }

    public void setReservation_hour(String reservation_hour) {
        this.reservation_hour = reservation_hour;
    }
    
    
}
