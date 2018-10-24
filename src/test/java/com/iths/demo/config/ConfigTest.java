package com.iths.demo.config;

import org.apache.commons.configuration.Configuration;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @author sen.huang
 * @date 2018/10/24.
 */
@ContextConfiguration(locations = { "classpath:spring-test.xml" })
public class ConfigTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private Configuration configuration;

    @Test
    public void testGet(){
        String pwd = configuration.getString("settings.mongodb.password");
        System.out.println(pwd);
    }
}
