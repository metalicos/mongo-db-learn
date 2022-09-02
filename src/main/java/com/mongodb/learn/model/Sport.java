package com.mongodb.learn.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document
@RequiredArgsConstructor
public class Sport {
    @Id
    private int id;
    @Field
    private String sportName;
    @Field
    private SportProficiency sportProficiency;
}
