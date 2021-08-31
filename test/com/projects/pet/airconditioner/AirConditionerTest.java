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
        assertEquals(16, ac.getTemperature());
        ac.increaseTemperature();
        ac.increaseTemperature();
        assertEquals(16 + 2, ac.getTemperature());
    }

    @Test
    void airConditionerCanReduceTemperature() {
        assertFalse(ac.isOn());
        ac.turnOn();
        assertTrue(ac.isOn());
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.reduceTemperature();
        assertEquals(17, ac.getTemperature());
    }

    @Test
    void testThatTemperatureCannotIncreasePastItsHighestLimit() {
        assertFalse(ac.isOn());
        ac.turnOn();
        assertTrue(ac.isOn());
        for(int i = 0; i < 15; i ++){
            ac.increaseTemperature();
        }
        assertEquals(30, ac.getTemperature());
        ac.increaseTemperature();
        assertEquals(30, ac.getTemperature());
    }

    @Test
    void testThatTemperatureCannotReducePastItsHighestLimit() {
        assertFalse(ac.isOn());
        ac.turnOn();
        assertTrue(ac.isOn());
        ac.reduceTemperature();
        assertEquals(16, ac.getTemperature());
    }
}
