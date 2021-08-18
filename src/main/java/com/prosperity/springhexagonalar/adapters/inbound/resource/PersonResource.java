package com.prosperity.springhexagonalar.adapters.inbound.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/persons", produces = MediaType.APPLICATION_JSON_VALUE)
public interface PersonResource {
}
