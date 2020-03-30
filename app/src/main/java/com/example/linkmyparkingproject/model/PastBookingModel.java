package com.example.linkmyparkingproject.model;

public class PastBookingModel {

    private int vehicleType;
    private String numberPlate;
    private String duration;
    private String time,date;

    public PastBookingModel(int vehicleType, String numberPlate, String duration, String time, String date) {
        this.vehicleType = vehicleType;
        this.numberPlate = numberPlate;
        this.duration = duration;
        this.time = time;
        this.date = date;
    }

    public int getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(int vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
