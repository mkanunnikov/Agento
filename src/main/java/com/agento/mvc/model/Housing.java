package com.agento.mvc.model;

/** Абстрактный класс Жилье, описывает общие параметры для различных типов жилья (квартира, коттедж)
 */
public abstract class Housing {

    /** Общая площадь жилья
     */
    private Double totalArea;

    /** Жилая площадь
     */
    private Double livingArea;

    /** Площадь кухни
     */
    private Double kitchenArea;

    /** Высота комнат
     */
    private Double height;

    /** Адрес жилья, в дальнейшем предполагается использование специфичного класса Адрес
     */
    private String address;

    /** Количество занимаемых этажей
     */
    private Integer livingFloors;

    /** Количество комнат
     */
    private Integer rooms;

    /** Количество гаражей либо парковочных мест
     */
    private Integer garages;

    /** Общее состояние жилья по 10-и бальной шкале
     */
    private Integer condition;

    public Double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(Double totalArea) {
        this.totalArea = totalArea;
    }

    public Double getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(Double livingArea) {
        this.livingArea = livingArea;
    }

    public Double getKitchenArea() {
        return kitchenArea;
    }

    public void setKitchenArea(Double kitchenArea) {
        this.kitchenArea = kitchenArea;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getLivingFloors() {
        return livingFloors;
    }

    public void setLivingFloors(Integer livingFloors) {
        this.livingFloors = livingFloors;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Integer getGarages() {
        return garages;
    }

    public void setGarages(Integer garages) {
        this.garages = garages;
    }

    public Integer getCondition() {
        return condition;
    }

    public void setCondition(Integer condition) {
        this.condition = condition;
    }
}
