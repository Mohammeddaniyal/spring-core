package com.daniyal.vehicles;

public class FestivalDiscountService implements DiscountService{
    @Override
    public String getDiscountMessage() {
        return "1% for todays' festival";
    }
}
