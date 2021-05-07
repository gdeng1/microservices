package com.kc.microservices.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Detail info about user")
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @Size(min=2, message = "Name should at least have 2 chars")
    @ApiModelProperty(notes = "Name has to be equal or greater than 2 chars")
    private String name;

    @Past
    @ApiModelProperty(notes = "Birthday can't be in the future")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;
}
