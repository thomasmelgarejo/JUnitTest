package com.door.controller;

import com.door.model.Person;
import com.door.service.OpdaterPerson;

import java.time.LocalDate;
import java.util.ArrayList;

public class MyController {


    public void personData(){
        ArrayList<Person> inputListe = new ArrayList<>();
        OpdaterPerson opdaterPerson = new OpdaterPerson();

        //Data til input som så skal ændres
        //inputListe.add(new Person("Kurt", LocalDate.of(2020,10,10),4));



        opdaterPerson.opdaterPersonMetode(inputListe);

    }

}
