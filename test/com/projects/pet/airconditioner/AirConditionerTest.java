package com.projects.pet.airconditioner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    private AirConditioner ac;

    @BeforeEach
    void beforeEach() {
        ac = new AirConditioner();
    }

    @Test
    void airConditionerComesOnWhenTurnedOn() {
        assertFalse(ac.isOn());
        ac.turnOn();
        assertTrue(ac.isOn());
    }

    @Test
    void airConditionerGoesOffWhenTurnedOff() {
        assertFalse(ac.isOn());
        ac.turnOn();
        assertTrue(ac.isOn());
        ac.turnOff();
        assertFalse(ac.isOn());
    }

    @Test
    void airConditionerCanIncreaseTemperature() {
        assertFalse(ac.isOn());
        ac.turnOn();
        assertTrue(ac.isOn());
        ac.increaseTemperature(20);
        assertEquals(20 + 1, ac.getHigherTemperature());
    }

    @Test
    void airConditionerCanReduceTemperature() {
        assertFalse(ac.isOn());
        ac.turnOn();
        assertTrue(ac.isOn());
        ac.reduceTemperature(20);
        assertEquals(20 - 1, ac.getLowerTemperature());
    }

    @Test
    void testThatTemperatureCannotIncreasePastItsHighestLimit() {
        assertFalse(ac.isOn());
        ac.turnOn();
        assertTrue(ac.isOn());
        ac.increaseTemperature(30);
        assertEquals(30, ac.getHigherTemperature());
    }

    @Test
    void testThatTemperatureCannotReducePastItsHighestLimit() {
        assertFalse(ac.isOn());
        ac.turnOn();
        assertTrue(ac.isOn());
        ac.reduceTemperature(16);
        assertEquals(16, ac.getLowerTemperature());
    }
}
