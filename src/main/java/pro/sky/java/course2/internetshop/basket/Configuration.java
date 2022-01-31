package pro.sky.java.course2.internetshop.basket;


import org.springframework.context.annotation.Bean;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course2.internetshop.service.Basket;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    @SessionScope
    public Basket create() {
        return new Basket();
    }
}
