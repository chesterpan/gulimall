package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1. 如何使用Nacos作为配置依赖
 * 	1） 引入依赖
 * 	2） 创建一个bootstrap.properties
 * 	3) 需要给配置中心创建一个数据集(Data-ID) 默认规则 应用名.properties
 * 	4） 给其添加任意配置
 * 	5） 动态获取配置：
 * 		1） @RefreshScope
 * 		2） @Value(${配置项的名字})
 * 		* 重名时优先使用配置中心的配置
 * 2. 细节
 * 	1）命名空间：配置隔离：
 * 		默认public(保留空间) 默认新增的配置都在public
 * 		1. 利用命名空间来做环境隔离
 * 		*  在bootstrap.properties中添加
 * 		*  spring.cloud.nacos.config.namespace={命名空间ID}
 * 		2. 每一个微服务之间互相隔离，每个微服务都创建自己的命名空间。只加载自己命名空间下的所有配置
 * 	2）配置集
 * 		所有配置的集合
 * 	3）配置集ID
 * 		Data ID, 类似文件名
 * 	4）配置分组
 * 		默认所有的配置集都归属于DEFAULT_GROUP
 * 3。 总结
 * 	每个微服务创建自己的命名空间，用group区分不同的环境
 * 	1) 微服务任何配置信息，任何配置文件都可以放在配置中心
 * 		只需要在bootstrap.properties中注明即可
 * 	2) @Value @ConfigurationProperties
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallCouponApplication.class, args);
	}

}
