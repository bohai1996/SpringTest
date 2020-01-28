package com.bohai.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 标志该类是spring的核心配置类
@Configuration

// <context:component-scan base-package="com.bohai" />
@ComponentScan("com.bohai")

@Import({DataSourceConfiguration.class})
public class SpringConfiguration {
}
