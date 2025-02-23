package com.turkcell.TurkcellCRM.searchService.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("filter-customer")
public class Customer {
    @Id
    private String id;

    @Field(name="firstName")
    private String firstName;

    @Field(name="secondName")
    private String secondName;

    @Field(name="lastName")
    private String lastName;

    @Field(name="birthDate")
    private LocalDateTime birthDate;

    @Field(name="gender")
    private String gender;

    @Field(name="fatherName")
    private String fatherName;

    @Field(name="motherName")
    private String motherName;

    @Field(name="nationalityNumber")
    private String nationalityNumber;
}