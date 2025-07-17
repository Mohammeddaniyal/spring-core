package com.daniyal.vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// spring theory if class name first and second letter are both upper case
// while creating bean and giving it default id
// it will not do this Car --> car
// but in this case no change THAR --> THAR
// more examples WWEThar --> WWEThar correct, wWeThar this is wrong
@Component
public class THAR implements Vehicle{
    // showing injection using @Autowired
    // field injection
    @Autowired
    private DiscountService discountService;

    @Override
    public String getMileage() {
        return "25kmpl";
    }

    @Override
    public String getDiscountMessage() {
        return "Thar : "+this.discountService.getDiscountMessage();
    }
}
