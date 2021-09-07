package com.projects.pet.bike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BicycleTest {
    private Bicycle powerBike;

    @BeforeEach
    void setUp() {
        powerBike = new Bicycle();
    }

    @Test
    void bicycleCanBeTurnedOn() {
        assertFalse(powerBike.isOn());
        powerBike.turnOn();
        assertTrue(powerBike.isOn());
    }

    @Test
    void bicycleCanGoOffIfBicycleIsOn() {
        assertFalse(powerBike.isOn());
        powerBike.turnOn();
        assertTrue(powerBike.isOn());
        powerBike.turnOff();
        assertFalse(powerBike.isOn());
    }

    @Test
    void speedOfBicycleIncreasesByOneAtGearOne() {
        assertFalse(powerBike.isOn());
        powerBike.turnOn();
        assertTrue(powerBike.isOn());
        assertEquals(0,powerBike.getSpeed());
        powerBike.accelerate();
    }
}
