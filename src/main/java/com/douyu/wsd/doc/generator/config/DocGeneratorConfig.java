package com.douyu.wsd.doc.generator.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration

public class DocGeneratorConfig {
    @Value("${docGenerator.componentScan}")
    public String componentScan;
    @Value("${docGenerator.title}")
    public String title;
    @Value("${docGenerator.developer}")
    public String developer;
    @Value("${docGenerator.developerUrl}")
    public String developerUrl;
    @Value("${docGenerator.developerEmail}")
    public String developerEmail;
    @Value("${docGenerator.version}")
    public String version;
    @Value("${docGenerator.description}")
    public String description;
    @Value("${docGenerator.termsOfServiceUrl}")
    public String termsOfServiceUrl;
    @Value("${docGenerator.exportDir}")
    public String exportDir;
}
