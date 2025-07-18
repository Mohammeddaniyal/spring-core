package com.daniyal.vehicles;

import org.springframework.stereotype.Component;

@Component
public class WWEDiscountService implements DiscountService{
    @Override
    public String getDiscountMessage() {
        return "On today's main event, we give you 10% discount";
    }
}
