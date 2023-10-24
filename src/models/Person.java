package models;

import models.enums.Gender;

public class Person {
    private String name;
    private String surname;
    private final Gender GENDER;
    private final String BIRTH_DATE;
    private final String NATIONALITY;
    private String address;
    private String phoneNumber;

    public Person(String name, String surname, Gender GENDER, String BIRTH_DATE, String NATIONALITY) {
        this.name = name;
        this.surname = surname;
        this.GENDER = GENDER;
        this.BIRTH_DATE = BIRTH_DATE;
        this.NATIONALITY = NATIONALITY;
    }

    public Person(String name, String surname, Gender GENDER, String BIRTH_DATE, String NATIONALITY, String address, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.GENDER = GENDER;
        this.BIRTH_DATE = BIRTH_DATE;
        this.NATIONALITY = NATIONALITY;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGENDER() {
        return GENDER;
    }

    public String getBIRTH_DATE() {
        return BIRTH_DATE;
    }

    public String getNATIONALITY() {
        return NATIONALITY;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
