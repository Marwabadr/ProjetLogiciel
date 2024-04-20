package com.example.demo.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**")
                .addResourceLocations("classpath:/templates/css/");
        registry.addResourceHandler("/js/**")
                .addResourceLocations("classpath:/templates/js/");
        registry.addResourceHandler("/vendors/**")
                .addResourceLocations("classpath:/templates/vendors/");
        registry.addResourceHandler("/images/**")
                .addResourceLocations("classpath:/templates/images/");
        registry.addResourceHandler("/pages/**")
                .addResourceLocations("classpath:/templates/pages/");
        registry.addResourceHandler("/documentation/**")
                .addResourceLocations("classpath:/templates/documentation/");
    }
}
