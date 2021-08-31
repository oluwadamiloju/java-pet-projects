package com.projects.pet.airconditioner;

public class AirConditioner {

    private boolean isOn;
    private int temperature;

    public AirConditioner() {}

    public AirConditioner(boolean isOn, int temperature) {
        this.isOn = isOn;
        this.temperature = temperature;
    }

    public void turnOn() {
        this.isOn = true;
        this.temperature = 16;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if(isOn) {
            if(temperature<30) temperature++;
        }
    }

    public void reduceTemperature() {
        if(isOn) {
            if(temperature>16) temperature--;
        }
    }
}
