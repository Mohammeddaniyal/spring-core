package com.daniyal.vehicles;

public class Car implements Vehicle{
    DiscountService discountService;

    @Override
    public String getMileage() {
        return "30 kmpl";
    }

    @Override
    public String getDiscountMessage() {
        return this.discountService.getDiscountMessage();
    }
}
