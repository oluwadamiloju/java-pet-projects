package com.projects.pet.bike;

public class Bicycle {
    private boolean isOn;
    private int speed;
    private enum Gear {GEAR_ONE, GEAR_TWO, GEAR_THREE, GEAR_FOUR}

    public Bicycle() {}

    public Bicycle(boolean isOn, int speed) {
        this.isOn = isOn;
        this.speed = speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        this.isOn = true;
        this.speed = 0;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int accelerate() {
        Gear gear = Gear.GEAR_ONE;
        if(speed > 0 && speed <= 20) {
            gear = Gear.GEAR_ONE;
        }
        if(speed >= 21 && speed <= 30) {
            gear = Gear.GEAR_TWO;
        }
        if(speed >= 31 && speed <= 40) {
            gear = Gear.GEAR_THREE;
        }
        if(speed >= 41) {
            gear = Gear.GEAR_FOUR;
        }
        return gear;
    }
}
