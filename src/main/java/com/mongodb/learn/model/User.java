package com.mongodb.learn.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;


@Data
@Document
@RequiredArgsConstructor
public class User {
    @Id
    private int id;
    @Field
    private String email;
    @Field
    private String fullName;
    @Field
    private Date birthDate;
    @Field
    private Gender gender;
    @Field
    private Sport sport;
}