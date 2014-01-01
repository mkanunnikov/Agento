package com.agento.mvc.model;

/** Клиент не имеет прямого доступа к информации об объектах и может контактировать только с Агентом
 */
public class Customer extends Person {

    /** Обслуживающий Агент
     */
    private Agent agent;

}
