package com.flamelab.service;

import com.flamelab.entity.Person;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
public interface ModifyPerson {
    Person createPersonToSaving(String name);
}
