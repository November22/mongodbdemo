package com.iths.demo.mongo.service;

import com.iths.demo.mongo.bo.OperationLogBO;

/**
 * @author sen.huang
 * @date 2018/10/24.
 */
public interface OperationLogService {

    public void save(OperationLogBO operationLogBO);

    public void update(OperationLogBO operationLogBO);

    public void delete(OperationLogBO operationLogBO);
}
