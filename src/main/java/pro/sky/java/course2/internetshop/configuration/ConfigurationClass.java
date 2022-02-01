package pro.sky.java.course2.internetshop.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.web.context.annotation.SessionScope;

@org.springframework.context.annotation.Configuration
public class ConfigurationClass {
    @Bean
    @SessionScope
    public Basket create() {
        return new Basket();
    }
}
