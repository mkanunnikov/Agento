package com.agento.mvc.model;

/**
 * Created by Max on 20.12.13.
 */
public class House extends Housing {

    private Double landArea;

    /** Высота мансарды, если нет - то 0
     */
    private Double mansard;


    public House(Double landArea) {
        this.landArea = landArea;
    }

    public Double getLandArea() {
        return landArea;
    }

    public void setLandArea(Double landArea) {
        this.landArea = landArea;
    }
}
