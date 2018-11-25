package com.ptteng.water.common.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ProjectName: sildenafil
 * @Package: com.jnshu.sildenafil.common
 * @ClassName: MyBatisPlus
 * @Description: mybatisPlus配置类
 * @Author: Taimur
 * @CreateDate: 2018/10/30 19:26
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.ptteng.water.system.mapper.*")
public class MybatisPlusConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
