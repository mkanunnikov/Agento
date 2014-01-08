package com.agento.mvc.model;

/** Объект Сделки создается с описанием Сущности Объекта
 */
public class DealObject {

    /** Сущности Объекта
     */
    private ObjectGist description;

    /** Цена
     */
    private Double price;

    public ObjectGist getDescription() {
        return description;
    }

    public void setDescription(ObjectGist description) {
        this.description = description;
    }

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
