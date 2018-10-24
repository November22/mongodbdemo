package com.iths.demo.mongo.bo;

import java.io.Serializable;

/**
 * @author sen.huang
 * @date 2018/10/24.
 */
public class OperationLogBO implements Serializable {

    private static final long serialVersionUID = 2941583757148936947L;

    private String id;

    private String name;

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
