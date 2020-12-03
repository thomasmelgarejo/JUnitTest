package com.door.service;

import com.door.model.Person;

import java.util.ArrayList;

public class OpdaterPerson {


    public ArrayList<Person> opdaterPersonMetode(ArrayList<Person> OldList){

        int antalPetsOld = OldList.get(0).getAntalPets();

        OldList.get(0).setAntalPets(antalPetsOld+1); //Lægger et pet til

        System.out.println("Printer opdateret liste" + OldList);
        return OldList;
    }
}
