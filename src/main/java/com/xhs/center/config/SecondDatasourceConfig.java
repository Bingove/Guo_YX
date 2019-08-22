/*
package com.xhs.center.config;
*/
/**
 * .............................................
 * 佛祖保佑             永无BUG
 * 佛曰:
 * 写字楼里写字间，写字间里程序员；
 * 程序人员写程序，又拿程序换酒钱。
 * 酒醒只在网上坐，酒醉还来网下眠；
 * 酒醉酒醒日复日，网上网下年复年。
 * 但愿老死电脑间，不愿鞠躬老板前；
 * 奔驰宝马贵者趣，公交自行程序员。
 * 别人笑我忒疯癫，我笑自己命太贱；
 *
 * @Motto 纵有疾风起  人生不言弃
 *//*


import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

*/
/**
 * @projectName Monitor_Management
 * @packageName com.xhs.center.config
 * @Author 常冬军
 * @Date 2019/08/22 11:43
 * @title SecondDatasourceConfig
 * @ToDo
 *//*

//@Configuration
//@MapperScan(basePackages = SecondDatasourceConfig.PACKAGE, sqlSessionFactoryRef = "secondSqlSessionFactory")
public class SecondDatasourceConfig {
    private Logger logger = LoggerFactory.getLogger(SecondDatasourceConfig.class);
    static final String PACKAGE = "com.xhs.center.dao.second";
    static final String MAPPER_LOCATION = "classpath:mapper/second/*.xml";

    @Bean(name = "secondDataSource")
    @ConfigurationProperties(prefix = "hikari.second")
    public HikariDataSource dataSource() {
        logger.info("初始化 second --- MySQL 数据源");
        return new HikariDataSource();
    }

    @Bean(name = "secondTransactionManager")
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(this.dataSource());
    }

    @Bean(name = "secondSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("secondDataSource") DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        //sessionFactory.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(SecondDatasourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}

*/
