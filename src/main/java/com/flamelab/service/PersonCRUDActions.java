package com.flamelab.service;

import com.flamelab.entity.Person;
import org.bson.types.ObjectId;

public interface PersonCRUDActions {

    Person createPerson(Person person);

    Iterable<Person> getAllPersons();

    Person getPersonById(ObjectId id);

    Person updatePersonById(ObjectId id, Person person);

    String deletePersonById(ObjectId id);

}
