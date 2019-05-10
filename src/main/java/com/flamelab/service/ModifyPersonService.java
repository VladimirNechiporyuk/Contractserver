package com.flamelab.service;

import com.flamelab.entity.Person;
import org.springframework.stereotype.Service;

@Service
public class ModifyPersonService implements ModifyPerson {

    @Override
    public Person createPersonToSaving(String name) {
        return new Person(name);
    }
}
