package com.daniyal.vehicles;

import org.springframework.stereotype.Component;

@Component
public class FestivalDiscountService implements DiscountService{
    @Override
    public String getDiscountMessage() {
        return "1% for today's festival";
    }
}
