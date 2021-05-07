package com.kc.microservices.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@ApiModel(description = "Detail info about user")
public class User {
    private Integer id;

    @Size(min=2, message = "Name should at least have 2 chars")
    @ApiModelProperty(notes = "Name has to be equal or greater than 2 chars")
    private String name;

    @Past
    @ApiModelProperty(notes = "Birthday can't be in the future")
    private LocalDate birthDate;
}
