package com.douyu.wsd.doc.generator.config;//swagger2的配置文件，在项目的启动类的同级文件建立
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ConditionalOnMissingBean
public class Swagger2 {
    @Autowired
    private DocGeneratorConfig config;

//swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //为当前包路径
                .apis(RequestHandlerSelectors.basePackage(config.componentScan))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false);
    }
    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title(config.title)
                //创建人
                .contact(new Contact(config.developer, config.developerUrl, config.developerEmail))
                //版本号
                .version(config.version)
                //描述
                .description(config.description)
                .termsOfServiceUrl(config.termsOfServiceUrl)
                .build();
    }
 
}