package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
* 1. 整合Mybatis-Plus
* 	1. 导入依赖
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
            <version>3.4.3.3</version>
        </dependency>
* 	2. 配置
* 		1. 配置数据源:
* 			1. 导入数据库的驱动
* 			2. application.yml中配置相关信息
* 		2. 配置Mybatis-Plus
* 			1. 使用MapperScan
* 			2. 同步映射文件位置
* 2. 逻辑删除
 * 	1. 配置全局的逻辑删除规则(可以省略)
 * 	2. 配置逻辑删除组件(3.1.0前才需要)
 * 	3. 加上逻辑删除注解@TableLogic
* */

@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallProductApplication.class, args);
	}

}
