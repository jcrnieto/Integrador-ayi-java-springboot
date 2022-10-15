package com.ayi.integrador.rest.serv.app.configuration;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan(basePackages={"com.ayi.integrador.rest.serv.app.configuration" +
        "com.ayi.integrador.rest.serv.app.service" +
        "com.ayi.integrador.rest.serv.app.mapper" +
        "com.ayi.integrador.rest.serv.app.repository"})
public class CommonsConfiguration {

    @Bean
    public ModelMapper modelMapper() {return new ModelMapper();}

}
