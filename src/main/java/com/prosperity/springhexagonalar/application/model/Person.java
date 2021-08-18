package com.prosperity.springhexagonalar.application.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private String id;
    private String name;
    private String document;
}
