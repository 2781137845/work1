package zhu_jie;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages = {"zhu_jie"})
@PropertySource(value = {"classpath:/name.properties"})
public class qwe {
}
