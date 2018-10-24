package com.iths.demo.mongo.repository;

import com.iths.demo.mongo.entity.OperationLog;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author sen.huang
 * @date 2018/10/24.
 */
public interface OperationLogRepository extends MongoRepository<OperationLog,String> {
}
