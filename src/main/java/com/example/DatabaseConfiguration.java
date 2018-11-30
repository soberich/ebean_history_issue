package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.ebean.EbeanServer;
import io.ebean.EbeanServerFactory;
import io.ebean.config.ServerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DatabaseConfiguration {

    private final Logger log = LoggerFactory.getLogger(DatabaseConfiguration.class);

    @Bean
    @Profile({ "test", "dev" })
    public ServerConfig serverConfigDev(ObjectMapper mapper) {
        return getServerConfig(mapper, "dev");
    }

    @Bean
    @Profile("prod")
    public ServerConfig serverConfigProd(ObjectMapper mapper) {
        return getServerConfig(mapper, "prod");
    }

    private ServerConfig getServerConfig(ObjectMapper mapper, String springProfile) {
        ServerConfig config = new ServerConfig();
        config.setDefaultServer(true);
        config.setRegister(true);
        config.setName(springProfile);
        config.loadFromProperties();
        config.setObjectMapper(mapper);
        return config;
    }

    @Bean
    public EbeanServer ebeanServer(ServerConfig config) {
        EbeanServer ebeanServer = EbeanServerFactory.create(config);
//        ///FIXME: Ugly hack as @PostConstruct triggers eager creation of ebean server
//        ///FIXME: and all ddls run first (upfront with DEFAULT non-custom configured plain eagerly created ebean server)
//        ///FIXME:      -> then all postconstruct methods run
//        ///FIXME:      -> then NEW ebean server is configured by this @Bean methods
//        ///FIXME:      -> then ddl executes again and all populated tables are dropped and recreated empty.
//        ///FIXME: Need to report that soon (now is 30/11/2018)
//        new BootstrapUsers().init();
//        new BootstrapScoring().init();
//        new BootstrapProviders().init();
//        new BootstrapStringResources().init();
        return ebeanServer;
    }
}
