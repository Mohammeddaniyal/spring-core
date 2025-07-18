package com.daniyal.vehicles;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    @Override
    public String getMileage() {
        return "30kmpl";
    }
}
