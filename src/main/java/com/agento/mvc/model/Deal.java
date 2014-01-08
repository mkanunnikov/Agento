package com.agento.mvc.model;

/** Сделка заключается между Клиентом и Агентом, Агент подбирает Объект Сделки
 */
public class Deal {

    /** Клиент
     */
    private Customer customer;

    /** Агент
     */
    private Agent agent;

    /** Объект
     */
    private DealObject object;

    /** Сумма сделки
     */
    private Double amount;

}
