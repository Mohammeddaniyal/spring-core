package com.daniyal.vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle{
    @Autowired
    private DiscountService discountService;
    @Override
    public String getMileage() {
        return "20kmpl";
    }

    @Override
    public String getDiscountMessage() {
        return "Bus : "+this.discountService.getDiscountMessage();
    }
}
