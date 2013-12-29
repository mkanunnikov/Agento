package com.agento.mvc.model;

/**
 * Created by Max on 20.12.13.
 */
public class Flat extends Housing {

    private Integer floor;


    public Flat(Integer floor) {
        this.floor = floor;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }
}
