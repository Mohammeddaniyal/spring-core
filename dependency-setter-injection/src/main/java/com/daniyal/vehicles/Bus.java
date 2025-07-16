package com.daniyal.vehicles;

public class Bus implements Vehicle{
    DiscountService discountService;


    @Override
    public String getMileage() {
        return "20 kmpl";
    }

    @Override
    public String getDiscountMessage() {
        return this.discountService.getDiscountMessage();
    }
}
