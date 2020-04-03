package com.lovo.boot.confi;

import com.lovo.boot.util.MyInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class MyWebConfiguer implements WebMvcConfigurer {

    //拦截器
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/gotoAddUser","/static/**");
    }

    /**
     * 放行静态资源
     * @param registry
     */
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
     //放行的文件
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }
}
