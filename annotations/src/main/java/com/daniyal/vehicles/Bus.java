package com.daniyal.vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("MyDearBus")
public class Bus implements Vehicle {
private DiscountService discountService;
// setter injection via @Autowired annotation

    @Autowired
    @Qualifier("festivalDiscountService")
    public void setDiscountService(DiscountService discountService) {
        this.discountService = discountService;
    }

    @Override
    public String getMileage() {
        return "20kmpl";
    }

    @Override
    public String getDiscountMessage() {
        return "Bus : "+this.discountService.getDiscountMessage();
    }
}
