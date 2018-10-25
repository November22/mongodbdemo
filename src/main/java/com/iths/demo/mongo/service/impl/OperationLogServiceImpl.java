package com.iths.demo.mongo.service.impl;

import com.iths.demo.mongo.bo.OperationLogBO;
import com.iths.demo.mongo.entity.OperationLog;
import com.iths.demo.mongo.repository.OperationLogRepository;
import com.iths.demo.mongo.service.OperationLogService;
import com.iths.demo.utils.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * @author sen.huang
 * @date 2018/10/24.
 */
@Service
public class OperationLogServiceImpl implements OperationLogService {

    @Autowired
    private OperationLogRepository repository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(OperationLogBO operationLogBO) {
        OperationLog operationLog = BeanMapper.map(operationLogBO, OperationLog.class);
        repository.save(operationLog);
    }

    @Override
    public void update(OperationLogBO operationLogBO) {
        mongoTemplate.save(operationLogBO,"test");
    }

    @Override
    public void delete(OperationLogBO operationLogBO) {
        mongoTemplate.remove(operationLogBO,"test");
    }
}
