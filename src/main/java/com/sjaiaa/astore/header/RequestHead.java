package com.sjaiaa.astore.header;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author sjaiaa
 * @date 2023/3/11 21:54
 * @discription
 */
@Configuration
public class RequestHead  implements WebMvcConfigurer {
    @Autowired
    private AnnotationsIntercept annotationsIntercept;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(annotationsIntercept).addPathPatterns("/**");
    }
}
