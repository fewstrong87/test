package com.fewstrong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fewstrong.reposiotry.BaseRepositoryFactoryBean;


@ComponentScan(basePackages = { "com.fewstrong" })
@EnableAutoConfiguration
@EntityScan("com.fewstrong")
@EnableJpaRepositories(basePackages = "com.fewstrong",
		// 指定自己的工厂类
		repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class)
@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
}
