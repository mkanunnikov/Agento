package com.agento.mvc.model;

import java.util.Date;

/** Описывает объект из первичного фонда, содержит свойства наследуемые от класса Сущность Объекта, а также определяет
 * свойства специфичные для объектов первичного фонда.
 */
public class Primary extends ObjectGist {

    /** Застройщик
     */
    private Developer developer;

    /** Дата сдачи
     */
    private Date passDate;

}
