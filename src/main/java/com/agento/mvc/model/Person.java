package com.agento.mvc.model;

/** Физическое лицо
 */
public class Person {

    /** Имя
     */
    private String firstName;

    /** Фамилия
     */
    private String lastName;

    /** Отчество
     */
    private String middleName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
