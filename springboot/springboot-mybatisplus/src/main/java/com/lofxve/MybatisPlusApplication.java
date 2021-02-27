package com.lofxve;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName MybatisPlusApplication
 * @Author lofxve
 * @Date 2021/1/18 8:54
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.lofxve.mapper")
public class MybatisPlusApplication {
    /**
     * @SpringBootConfiguration
     *      将当前类类作为配置类注入容器
     * @EnableAutoConfiguration
     *      @AutoConfigurationPackage
     *          @Import({Registrar.class})
     *              获取需要扫描的包
     *      @Import({AutoConfigurationImportSelector.class})
     *              从spring.factories获取需要注入容器的类
     * @ComponentScan(
     *       注解扫描，当前类所在包
     *     excludeFilters = {@Filter(
     *     type = FilterType.CUSTOM,
     *     classes = {TypeExcludeFilter.class}
     * ), @Filter(
     *     type = FilterType.CUSTOM,
     *     classes = {AutoConfigurationExcludeFilter.class}
     * )}
     * )
     */
    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class,args);
    }
}