package com.agento.mvc.model;

/** Класс Коттедж наследует общие свойства от класса Жилье и описывает специфичные свойства для класса Коттедж
 */
public class House extends Housing {

    /** Площадь земельного участка
     */
    private Double landArea;

    /** Высота мансарды, если нет - то 0
     */
    private Double mansard;

    /** ?
     */
    private CottageVillage village;

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
