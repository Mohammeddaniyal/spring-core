package com.daniyal.vehicles;

public class FestivalDiscountService implements DiscountService {
    @Override
    public String getDiscountMessage() {
        return "Please contact our discount service team!!!";
    }
}
