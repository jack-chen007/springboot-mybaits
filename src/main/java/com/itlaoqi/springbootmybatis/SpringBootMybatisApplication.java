package com.itlaoqi.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 测试111
 *test2222
 */
@SpringBootApplication
//MapperScan注解会在SpringBoot启动的时候扫描mapper包，并根据xml自动生成对应的实现类
@MapperScan("com.itlaoqi.springbootmybatis.mapper")
public class SpringBootMybatisApplication {

	public static void main(String[] args) {
		System.out.println("1113333222");
		SpringApplication.run(SpringBootMybatisApplication.class, args);
	}
}
