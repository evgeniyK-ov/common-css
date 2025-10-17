package ru.cpm.common.css.base.api.webflux.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
    basePackages = {
        "ru.sbrf.ufs.common.css.base.api.webflux"
    }
)
public class AutoConfiguration {

}
