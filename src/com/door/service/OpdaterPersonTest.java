package com.door.service;

import com.door.model.Person;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OpdaterPersonTest {

    @Test
    void opdaterPersonMetode() {
        OpdaterPerson opdaterPerson = new OpdaterPerson();

        //Denne list er de values der smides i parameter
        ArrayList<Person> OldInputList = new ArrayList<>();
        //Denne list er det forventede resultat
        ArrayList<Person> expectedList = new ArrayList<>();

        //Indsætter data
        OldInputList.add(new Person("Kaj", LocalDate.of(2020,10,10),10));
        expectedList.add(new Person("Kaj", LocalDate.of(2020,10,10),11));

        //Resultat når den køres gennem metoden der skal testes
        ArrayList<Person> actual = opdaterPerson.opdaterPersonMetode(OldInputList);

        //Testen
        assertEquals(expectedList,actual); //VIRKER IKKE
//        assertArrayEquals(expectedList,actual); //VIRKER IKKE
        //assertEquals(expectedList.get(0).getAntalPets(), actual.get(0).getAntalPets()); //VIRKER

    }
}