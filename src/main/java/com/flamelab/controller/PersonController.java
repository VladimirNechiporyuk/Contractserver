package com.flamelab.controller;

import com.flamelab.entity.Person;
import com.flamelab.service.ModifyPerson;
import com.flamelab.service.PersonService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private ModifyPerson modifyPerson;

    @PostMapping("/")
    @ResponseBody
    public Person createPerson(@RequestParam("Name") String name) {
        Person savedPerson = modifyPerson.createPersonToSaving(name);
        return personService.createPerson(savedPerson);
    }

    @GetMapping("/")
    @ResponseBody
    public Iterable<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Person getPersonById(@PathVariable("id") ObjectId id) {
        return personService.getPersonById(id);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Person updatePersonById(@PathVariable("id") ObjectId id, @RequestParam("Name") String name) {
        Person updatedPerson = modifyPerson.createPersonToSaving(name);
        return personService.updatePersonById(id, updatedPerson);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public String deletePersonById(@PathVariable("id") ObjectId id) {
        return personService.deletePersonById(id);
    }
}
