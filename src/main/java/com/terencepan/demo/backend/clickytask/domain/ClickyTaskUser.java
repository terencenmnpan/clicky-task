package com.terencepan.demo.backend.clickytask.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ClickyTaskUser {
    @Id
    private String id;

    @Indexed(unique = true)
    private String userName;

    @Indexed(unique = true)
    private String emailAddress;

    private String firstName;

    private String middleName;

    private String lastName;

    private String dob;


}
