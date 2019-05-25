package com.busyunit.email.docker.config;

import com.busyunit.email.docker.util.UuidBeanFactory;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.TypeMappingOptions;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactoryBean;

import java.util.UUID;

/**
 * <p/>
 * {@code FreemarkerConfig} represents a request during FreemarkerConfig creation.
 * <p/>
 *
 * @author ramayall
 * @since 22/04/2019
 */

@Configuration
public class SpringConfiguration {

    @Bean
    public static Mapper getMapper() {
        BeanMappingBuilder builder = new BeanMappingBuilder() {
            protected void configure() {
                mapping(UUID.class, UUID.class, TypeMappingOptions.oneWay(),
                        TypeMappingOptions.beanFactory(
                                UuidBeanFactory.class.getName()));
            }
        };

        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.addMapping(builder);

        return mapper;
    }
}
