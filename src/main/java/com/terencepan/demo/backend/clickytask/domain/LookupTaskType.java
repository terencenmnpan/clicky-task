package com.terencepan.demo.backend.clickytask.domain;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class LookupTaskType {

    @Indexed(unique = true)
    private String taskType;

    private String taskDescription;
}
