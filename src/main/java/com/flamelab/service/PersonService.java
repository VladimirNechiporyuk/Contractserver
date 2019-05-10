package com.flamelab.service;

import com.flamelab.entity.Person;
import com.flamelab.repository.PersonRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements PersonCRUDActions {

    @Autowired
    private PersonRepository repository;

    @Override
    public Person createPerson(Person person) {
        return repository.save(person);
    }

    @Override
    public Iterable<Person> getAllPersons() {
        return repository.findAll();
    }

    @Override
    public Person getPersonById(ObjectId id) {
        return repository.findOne(id);
    }

    @Override
    public Person updatePersonById(ObjectId id, Person personWithNewData) {
        personWithNewData.setId(this.getPersonById(id).getId());
        return repository.save(personWithNewData);
    }

    @Override
    public String deletePersonById(ObjectId id) {
        repository.delete(id);
        return String.format("Person with id %s was deleted", id.toString());
    }
}
