package com.kc.microservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
//@JsonIgnoreProperties(value ={"field2", "field3"})
@JsonFilter(value = "SomeBeanFilter")
public class SomeBean {
//    @JsonIgnore
    private String field1;
    private String field2;
    private String field3;
}
