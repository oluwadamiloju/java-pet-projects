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
        assertEquals(1, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_ONE, powerBike.getGear());
    }

    @Test
    void speedOfBicycleIncreasesByTwoAtGearTwo() {
        assertFalse(powerBike.isOn());
        powerBike.turnOn();
        assertTrue(powerBike.isOn());
        assertEquals(0,powerBike.getSpeed());
        powerBike.accelerate();
        assertEquals(1, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_ONE, powerBike.getGear());
        for (int i = 0; i < 20; i++) {
            powerBike.accelerate();
        }
        assertEquals(21, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_TWO, powerBike.getGear());
        powerBike.accelerate();
        assertEquals(23, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_TWO, powerBike.getGear());
    }

    @Test
    void speedOfBicycleIncreasesByThreeAtGearThree() {
        assertFalse(powerBike.isOn());
        powerBike.turnOn();
        assertTrue(powerBike.isOn());
        assertEquals(0,powerBike.getSpeed());
        for (int i = 0; i < 20; i++) {
            powerBike.accelerate();
        }
        assertEquals(20, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_ONE, powerBike.getGear());
        powerBike.accelerate();
        assertEquals(21, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_TWO, powerBike.getGear());
        for (int i = 0; i < 5; i++) {
            powerBike.accelerate();
        }
        assertEquals(31, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_THREE, powerBike.getGear());
        powerBike.accelerate();
        assertEquals(34, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_THREE, powerBike.getGear());
    }

    @Test
    void speedOfBicycleIncreasesByFourAtGearFour() {
        assertFalse(powerBike.isOn());
        powerBike.turnOn();
        assertTrue(powerBike.isOn());
        assertEquals(0,powerBike.getSpeed());
        for (int i = 0; i < 20; i++) {
            powerBike.accelerate();
        }
        assertEquals(20, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_ONE, powerBike.getGear());
        powerBike.accelerate();
        assertEquals(21, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_TWO, powerBike.getGear());
        for (int i = 0; i < 5; i++) {
            powerBike.accelerate();
        }
        assertEquals(31, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_THREE, powerBike.getGear());
        for (int i = 0; i < 4; i++) {
            powerBike.accelerate();
        }
        assertEquals(43, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_FOUR, powerBike.getGear());
        powerBike.accelerate();
        assertEquals(47, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_FOUR, powerBike.getGear());
    }

    @Test
    void speedOfBicycleDecreasesByOneAtGearOne() {
        assertFalse(powerBike.isOn());
        powerBike.turnOn();
        assertTrue(powerBike.isOn());
        assertEquals(0,powerBike.getSpeed());
        powerBike.accelerate();
        powerBike.accelerate();
        assertEquals(2, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_ONE, powerBike.getGear());
        powerBike.decelerate();
        assertEquals(1, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_ONE, powerBike.getGear());
    }

    @Test
    void speedOfBicycleDecreasesByTwoAtGearTwo() {
        assertFalse(powerBike.isOn());
        powerBike.turnOn();
        assertTrue(powerBike.isOn());
        assertEquals(0,powerBike.getSpeed());
        powerBike.accelerate();
        assertEquals(1, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_ONE, powerBike.getGear());
        for (int i = 0; i < 21; i++) {
            powerBike.accelerate();
        }
        assertEquals(23, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_TWO, powerBike.getGear());
        powerBike.decelerate();
        assertEquals(21, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_TWO, powerBike.getGear());
    }

    @Test
    void speedOfBicycleDecreasesByThreeAtGearThree() {
        assertFalse(powerBike.isOn());
        powerBike.turnOn();
        assertTrue(powerBike.isOn());
        assertEquals(0,powerBike.getSpeed());
        for (int i = 0; i < 20; i++) {
            powerBike.accelerate();
        }
        assertEquals(20, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_ONE, powerBike.getGear());
        powerBike.accelerate();
        assertEquals(21, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_TWO, powerBike.getGear());
        for (int i = 0; i < 6; i++) {
            powerBike.accelerate();
        }
        assertEquals(34, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_THREE, powerBike.getGear());
        powerBike.decelerate();
        assertEquals(31, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_THREE, powerBike.getGear());
    }

    @Test
    void speedOfBicycleDecreasesByFourAtGearFour() {
        assertFalse(powerBike.isOn());
        powerBike.turnOn();
        assertTrue(powerBike.isOn());
        assertEquals(0,powerBike.getSpeed());
        for (int i = 0; i < 20; i++) {
            powerBike.accelerate();
        }
        assertEquals(20, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_ONE, powerBike.getGear());
        powerBike.accelerate();
        assertEquals(21, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_TWO, powerBike.getGear());
        for (int i = 0; i < 5; i++) {
            powerBike.accelerate();
        }
        assertEquals(31, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_THREE, powerBike.getGear());
        for (int i = 0; i < 5; i++) {
            powerBike.accelerate();
        }
        assertEquals(47, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_FOUR, powerBike.getGear());
        powerBike.decelerate();
        assertEquals(43, powerBike.getSpeed());
        assertSame(Bicycle.Gear.GEAR_FOUR, powerBike.getGear());
    }
}
