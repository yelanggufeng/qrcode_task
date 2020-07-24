package com.mobiusvision.qrcode.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.resource.PathResourceResolver;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;
import org.springframework.web.util.UrlPathHelper;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.DocumentationCache;
import springfox.documentation.spring.web.json.Json;
import springfox.documentation.spring.web.json.JsonSerializer;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiResourceController;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.mappers.ServiceModelToSwagger2Mapper;
import springfox.documentation.swagger2.web.Swagger2Controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private static final String DEFAULT_PATH = "/qrcode/wxyj";

    public SwaggerConfig() {
    }

    @Bean
    public Docket createRestApi() {
        return (new Docket(DocumentationType.SWAGGER_2)).apiInfo(this.apiInfo()).select().apis(RequestHandlerSelectors.basePackage("com.mobiusvision.qrcode.controller")).paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return (new ApiInfoBuilder()).title("二维码追溯").description("二维码追溯模块").contact(new Contact("hanwei", "", "1052210474@qq.com")).version("1.0").build();
    }

    @Bean
    public SimpleUrlHandlerMapping swaggerUrlHandlerMapping(ServletContext servletContext, @Value("${swagger.mapping.order:10}") int order) throws Exception {
        SimpleUrlHandlerMapping urlHandlerMapping = new SimpleUrlHandlerMapping();
        Map<String, ResourceHttpRequestHandler> urlMap = new HashMap();
        PathResourceResolver pathResourceResolver = new PathResourceResolver();
        pathResourceResolver.setAllowedLocations(new Resource[]{new ClassPathResource("META-INF/resources/webjars/")});
        pathResourceResolver.setUrlPathHelper(new UrlPathHelper());
        ResourceHttpRequestHandler resourceHttpRequestHandler = new ResourceHttpRequestHandler();
        resourceHttpRequestHandler.setLocations(Arrays.asList(new ClassPathResource("META-INF/resources/webjars/")));
        resourceHttpRequestHandler.setResourceResolvers(Arrays.asList(pathResourceResolver));
        resourceHttpRequestHandler.setServletContext(servletContext);
        resourceHttpRequestHandler.afterPropertiesSet();
        urlMap.put("/qrcode/wxyj/webjars/**", resourceHttpRequestHandler);
        pathResourceResolver = new PathResourceResolver();
        pathResourceResolver.setAllowedLocations(new Resource[]{new ClassPathResource("META-INF/resources/")});
        pathResourceResolver.setUrlPathHelper(new UrlPathHelper());
        resourceHttpRequestHandler = new ResourceHttpRequestHandler();
        resourceHttpRequestHandler.setLocations(Arrays.asList(new ClassPathResource("META-INF/resources/")));
        resourceHttpRequestHandler.setResourceResolvers(Arrays.asList(pathResourceResolver));
        resourceHttpRequestHandler.setServletContext(servletContext);
        resourceHttpRequestHandler.afterPropertiesSet();
        urlMap.put("/qrcode/wxyj/**", resourceHttpRequestHandler);
        urlHandlerMapping.setUrlMap(urlMap);
        urlHandlerMapping.setOrder(order);
        return urlHandlerMapping;
    }

    @Controller
    @ApiIgnore
    @RequestMapping({"/qrcode/wxyj"})
    public static class SwaggerResourceController implements InitializingBean {
        @Autowired
        private ApiResourceController apiResourceController;
        @Autowired
        private Environment environment;
        @Autowired
        private DocumentationCache documentationCache;
        @Autowired
        private ServiceModelToSwagger2Mapper mapper;
        @Autowired
        private JsonSerializer jsonSerializer;
        private Swagger2Controller swagger2Controller;

        public SwaggerResourceController() {
        }

        public void afterPropertiesSet() {
            this.swagger2Controller = new Swagger2Controller(this.environment, this.documentationCache, this.mapper, this.jsonSerializer);
        }

        @RequestMapping
        public ModelAndView index() {
            ModelAndView modelAndView = new ModelAndView("redirect:/qrcode/wxyj/swagger-ui.html");
            return modelAndView;
        }

        @RequestMapping({"/swagger-resources/configuration/security"})
        @ResponseBody
        public ResponseEntity<SecurityConfiguration> securityConfiguration() {
            return this.apiResourceController.securityConfiguration();
        }

        @RequestMapping({"/swagger-resources/configuration/ui"})
        @ResponseBody
        public ResponseEntity<UiConfiguration> uiConfiguration() {
            return this.apiResourceController.uiConfiguration();
        }

        @RequestMapping({"/swagger-resources"})
        @ResponseBody
        public ResponseEntity<List<SwaggerResource>> swaggerResources() {
            return this.apiResourceController.swaggerResources();
        }

        @RequestMapping(
                value = {"/v2/api-docs"},
                method = {RequestMethod.GET},
                produces = {"application/json", "application/hal+json"}
        )
        @ResponseBody
        public ResponseEntity<Json> getDocumentation(@RequestParam(value = "group",required = false) String swaggerGroup, HttpServletRequest servletRequest) {
            return this.swagger2Controller.getDocumentation(swaggerGroup, servletRequest);
        }
    }
}
