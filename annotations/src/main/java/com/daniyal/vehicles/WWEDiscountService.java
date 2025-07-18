package com.daniyal.vehicles;

public class WWEDiscountService implements DiscountService{
    @Override
    public String getDiscountMessage() {
        return "On today's main event, we give you 10% discount";
    }
}
