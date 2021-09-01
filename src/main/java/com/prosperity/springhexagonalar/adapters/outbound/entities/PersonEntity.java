package com.prosperity.springhexagonalar.adapters.outbound.entities;

import lombok.Data;

import java.io.Serializable;

@Data
public class PersonEntity implements Serializable {

    private String id;
    private String name;
    private String document;
}
