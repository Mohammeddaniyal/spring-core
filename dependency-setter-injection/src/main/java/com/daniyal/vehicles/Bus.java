package com.daniyal.vehicles;

public class Bus implements Vehicle{
    DiscountService discountService;

    public void setDiscountService(DiscountService discountService) {
        this.discountService = discountService;
    }

    @Override
    public String getMileage() {
        return "20 kmpl";
    }

    @Override
    public String getDiscountMessage() {
        return "Bus : "+this.discountService.getDiscountMessage();
    }
}
