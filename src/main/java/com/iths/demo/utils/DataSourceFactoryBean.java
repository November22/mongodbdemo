package com.iths.demo.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.util.StringUtils;
import org.springframework.beans.factory.FactoryBean;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author sen.huang
 * @date 2018/10/24.
 */
public class DataSourceFactoryBean implements FactoryBean<DataSource> {

    private DataSource dataSource;

    @Override
    public DataSource getObject() throws Exception {
        if(dataSource != null){
            return dataSource;
        }else{
            createDateSource();
        }
        return dataSource;
    }

    @Override
    public Class<?> getObjectType() {
        return DataSource.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    private void createDateSource(){
        DruidDataSource ds = new DruidDataSource();
        try {
            ds.setUrl("jdbc:mysql://mysql.yhj.3g:3306/profile?Unicode=true&characterEncoding=utf8&allowMultiQueries=true");
            ds.setDriverClassName("com.mysql.jdbc.Driver");
            ds.setUsername("root");
            ds.setPassword("newpassword");
            ds.setName("CBP_PROFILE");
            ds.setDefaultCatalog(null);
            ds.setLoginTimeout(300);
            ds.setQueryTimeout(300);
            ds.setTestWhileIdle(true);
            ds.setInitialSize(2);
            ds.setMinIdle(1);
            ds.setMaxActive(5);
            ds.setDbType("mysql");
            //ds.setMaxWait(config.getUnreturnedConnectionTimeout() * 1000);
            ds.setMaxWaitThreadCount(Runtime.getRuntime().availableProcessors() * 20);
            //ds.setMaxPoolPreparedStatementPerConnectionSize(config.getMaxStatementsPerConnection());
            ds.setConnectionProperties("");
            ds.init();
            ds.setTestOnBorrow(false);
            ds.setTestWhileIdle(true);
            ds.setValidationQuery("select 1");
            dataSource = ds;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
