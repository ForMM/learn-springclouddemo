package com.kk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(BambooServerProperties.class)
@ConditionalOnClass(BambooServer.class)
@ConditionalOnProperty(prefix = "bamboo",value = "enabled",matchIfMissing = true)
public class BmbooServiceAutoConfiguration {

	@Autowired
	private BambooServerProperties mistraServiceProperties;

	@Bean(name = "bambooServer")
	@ConditionalOnMissingBean(BambooServer.class)
	public BambooServer mistraService(){
		BambooServer mistraService = new BambooServer();
		mistraService.setName(mistraServiceProperties.getName());
		return mistraService;
	}

}
