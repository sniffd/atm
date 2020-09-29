package ru.sbrf.atm.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "ru.sbrf.atm.server.repository")
public class ServerConfig {

}
