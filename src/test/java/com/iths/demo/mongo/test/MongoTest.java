package com.iths.demo.mongo.test;

import com.iths.demo.mongo.bo.OperationLogBO;
import com.iths.demo.mongo.service.OperationLogService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @author sen.huang
 * @date 2018/10/24.
 */
@ContextConfiguration(locations = { "classpath:spring-test.xml" })
public class MongoTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private OperationLogService service;

    @Test
    public void testSave(){
        OperationLogBO operationLogBO = new OperationLogBO();
        operationLogBO.setId("2019");
        operationLogBO.setName("wahaha");
        operationLogBO.setOperation("operationReview");
        service.save(operationLogBO);
    }
}
