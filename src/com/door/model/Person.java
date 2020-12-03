package com.door.model;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate birthday;
    private int antalPets;


    public Person(String name, LocalDate birthday, int antalPets) {
        this.name = name;
        this.birthday = birthday;
        this.antalPets = antalPets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAntalPets() {
        return antalPets;
    }

    public void setAntalPets(int antalPets) {
        this.antalPets = antalPets;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", antalpets=" + antalPets +
                '}';
    }
}
