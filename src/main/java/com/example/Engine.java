package com.example;

/**
 * Класс, представляющий двигатель автомобиля.
 */
public class Engine {
    private int power;
    private String manufacturer;

    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public int getPower() {
        return power;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}