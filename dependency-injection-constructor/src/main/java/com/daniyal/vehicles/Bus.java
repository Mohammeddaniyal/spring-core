package com.daniyal.vehicles;

public class Bus implements Vehicle{
    DiscountService discountService;

    Bus(DiscountService discountService)
    {
        this.discountService=discountService;
    }

    @Override
    public String getMileage() {
        return "20 kmpl";
    }

    @Override
    public String getDiscountMessage() {
        return this.discountService.getDiscountMessage();
    }
}
