package com.daniyal.vehicles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.daniyal.vehicles")
@PropertySource("car.properties")
public class Config {
    // create beans using @Bean instead of component
    // it's like something manual
    @Bean
    public Vehicle carr(){
        Car car=new Car(festivalDiscountService());
        return car;
    }
    @Bean
    public DiscountService festivalDiscountService(){
        FestivalDiscountService festivalDiscountService=new FestivalDiscountService();
        return festivalDiscountService;
    }
}
