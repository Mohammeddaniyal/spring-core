package com.daniyal.vehicles;

public class Car implements Vehicle{
    DiscountService discountService;
    private String brandName;
    private double maximumRetailPrice;

    public double getMaximumRetailPrice() {
        return maximumRetailPrice;
    }

    public void setMaximumRetailPrice(double maximumRetailPrice) {
        this.maximumRetailPrice = maximumRetailPrice;
    }

    public void setDiscountService(DiscountService discountService) {
        this.discountService = discountService;
    }

    public Car()
    {
        // default constructor
        // needed for bean instantiation
        // compiler will not write this constructor, due to parameterized const. presence
    }

    public Car(DiscountService discountService) {
        this.discountService = discountService;
    }

    public String getBrandName() {
        return brandName;

    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String getMileage() {
        return "30 kmpl";
    }

    @Override
    public String getDiscountMessage() {
        return "Car : " + this.discountService.getDiscountMessage();
    }
}
