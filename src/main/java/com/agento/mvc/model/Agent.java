package com.agento.mvc.model;

/** Агент заключает сделку с Клиентом и осуществляет подбор Объекта Сделки,
 * если искомый Объект находится вне зоны ответственности Агента, то Агент передает Сделку вверх по иерархии
 */
public class Agent extends Person{
    private Level level;

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
