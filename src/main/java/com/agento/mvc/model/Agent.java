package com.agento.mvc.model;

import java.util.List;

/** Агент заключает сделку с Клиентом и осуществляет подбор Объекта Сделки,
 * если искомый Объект находится вне зоны ответственности Агента, то Агент передает Сделку вверх по иерархии Шеф-Агенту
 */
public class Agent extends Person{

    /** Уровень доступа к данным
     */
    private Level level;

    /** Шеф-агент
     */
    private Agent chief;

    /** Курируемые агенты
     */
    private List<Agent> drivenAgents;

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
