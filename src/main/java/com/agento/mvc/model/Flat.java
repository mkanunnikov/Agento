package com.agento.mvc.model;

/** Класс Квартира наследует общие свойства от класса Жилье и описывает специфичные свойства для сущности Квартира
 */
public class Flat extends Housing {

    /** Этаж квартиры, нижний этаж если их несколько
     */
    private Integer floor;

    /** ?
     */
    private ApartmentHouse house;

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
