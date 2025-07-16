package com.daniyal.vehicles;

public class Car implements Vehicle{
    DiscountService discountService;

    public Car(DiscountService discountService) {
        this.discountService = discountService;
    }

    @Override
    public String getMileage() {
        return "30 kmpl";
    }

    @Override
    public String getDiscountMessage() {
        return this.discountService.getDiscountMessage();
    }
}
