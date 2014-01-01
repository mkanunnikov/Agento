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

}
