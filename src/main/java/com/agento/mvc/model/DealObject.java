package com.agento.mvc.model;

/** Объект Сделки создается с описанием Сущности Объекта
 */
public class DealObject {

    private ObjectGist description;
    private Double price;

    public DealObject(ObjectGist description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
