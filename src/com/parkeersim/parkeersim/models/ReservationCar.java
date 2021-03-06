package com.parkeersim.parkeersim.models;

import java.util.Random;
import java.awt.*;

public class ReservationCar extends Car{

    private static final Color COLOR=Color.green;

    public ReservationCar(){
        Random random = new Random();
        int stayMinutes = (int) (30+ random.nextFloat() * 2.5 * 60);
        int waitTime = (int)(5 + (random.nextFloat() * 60));
        this.setWaitTime(waitTime);
        this.setMinutesLeft(stayMinutes);
        this.setHasToPay(true);
        this.setTypeid(2);
    }
    public Color getColor() {return COLOR;}
}
