package com.excel.demo;/* 
@Author : Yogesh Deshmukh
*/

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;

@org.springframework.context.annotation.Configuration
public class DataSourceConfig {

    @Bean(name="entityManagerFactory")
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(getDataSource());

        return sessionFactory;
    }

        @Bean
        public DataSource getDataSource() {
            DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
            dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
            dataSourceBuilder.url("jdbc:mysql://localhost:3306/spring_securityDB?useSSL=false");
            dataSourceBuilder.username("root");
            dataSourceBuilder.password("Anna1234");
            return dataSourceBuilder.build();
        }
}
