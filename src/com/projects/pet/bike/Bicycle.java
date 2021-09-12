package com.projects.pet.bike;

public class Bicycle {
    private boolean isOn;
    private int speed;
    public enum Gear {GEAR_ONE, GEAR_TWO, GEAR_THREE, GEAR_FOUR}

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
//        this.speed = 0;
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

    public Gear getGear() {
        Gear gear = Gear.GEAR_ONE;
        if(speed >= 0 && speed <= 20) {
            gear = Gear.GEAR_ONE;
        } else if(speed > 20 && speed <= 30) {
            gear = Gear.GEAR_TWO;
        } else if(speed > 30 && speed <= 40) {
            gear = Gear.GEAR_THREE;
        } else if(speed >= 40) {
            gear = Gear.GEAR_FOUR;
        }
        return gear;
    }

    public void accelerate() {
        if(speed >= 0 && speed <= 20) {
            speed += 1;
        } else if(speed > 20 && speed <= 30) {
            speed += 2;
        } else if (speed > 30 && speed <= 40) {
            speed += 3;
        } else if (speed > 40) {
            speed += 4;
        }
    }

    public void decelerate() {
        if(speed >= 0 && speed <= 20) {
            speed -= 1;
        } else if(speed > 20 && speed <= 30) {
            speed -= 2;
        } else if (speed > 30 && speed <= 40) {
            speed -= 3;
        } else if (speed > 40) {
            speed -= 4;
        }
    }
}
