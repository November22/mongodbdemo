package com.iths.demo.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * @author sen.huang
 * @date 2018/10/24.
 */
@Document(collection = "test")
public class OperationLog implements Serializable {

    private static final long serialVersionUID = 2941583757148936947L;

    @Id
    private String id;

    @Field
    private String name;

    @Field
    private String operation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
