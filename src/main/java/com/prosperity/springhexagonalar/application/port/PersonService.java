package com.prosperity.springhexagonalar.application.port;

import com.prosperity.springhexagonalar.application.model.Person;

public interface PersonService {
    Person save(Person person);

    Person update(Person person);

    Person get(String id);
}
