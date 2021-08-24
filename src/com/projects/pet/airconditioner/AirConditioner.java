package com.projects.pet.airconditioner;

public class AirConditioner {

    private boolean isOn;
    private int highTemperature;
    private int lowTemperature;
    private final int[] temperatureArray = {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

    public AirConditioner() {}

    public AirConditioner(boolean isOn, int highTemperature, int lowTemperature) {
        this.isOn = isOn;
        this.highTemperature = highTemperature;
        this.lowTemperature = lowTemperature;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public int getHigherTemperature() {
        return highTemperature;
    }

    public void increaseTemperature(int temperature) {
        if(isOn) {
            for (int i = 0; i < temperatureArray.length; i++) {
                if (temperature != temperatureArray[temperatureArray.length - 1]) {
                    this.highTemperature = temperature + 1;
                    break;
                } else {
                    this.highTemperature = temperature;
                }
            }
        }
    }

    public void reduceTemperature(int temperature) {
        if(isOn) {
            for (int i = 0; i < temperatureArray.length; i++) {
                if (temperature != temperatureArray[0]) {
                    this.lowTemperature = temperature - 1;
                    break;
                } else {
                    this.lowTemperature = temperature;
                }
            }
        }
    }

    public int getLowerTemperature() {
        return lowTemperature;
    }
}
