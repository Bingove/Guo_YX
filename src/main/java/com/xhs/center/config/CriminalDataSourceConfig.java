package com.xhs.center.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Criminal 数据源
 *
 * @author sqs
 * @date 2018年3月26日
 */
/*@Configuration
@MapperScan(basePackages = CriminalDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "criminalSqlSessionFactory")
public class CriminalDataSourceConfig {
    private Logger logger = LoggerFactory.getLogger(CriminalDataSourceConfig.class);

    *//**
     * 精确到 criminal 目录，以便跟其他数据源隔离
     *//*
    static final String PACKAGE = "com.xhs.center.dao.a";
    static final String MAPPER_LOCATION = "classpath:mapper/a/*.xml";

    @Bean(name = "criminalDataSource")
    @ConfigurationProperties("spring.datasource.druid.criminal")
    public DataSource criminalDataSource() {
        logger.info("初始化第二个 MySQL 数据源");
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "criminalTransactionManager")
    public DataSourceTransactionManager criminalTransactionManager() {
        return new DataSourceTransactionManager(criminalDataSource());
    }

    @Bean(name = "criminalSqlSessionFactory")
    public SqlSessionFactory criminalSqlSessionFactory(@Qualifier("criminalDataSource") DataSource criminalDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(criminalDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(CriminalDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }


}*/
