package com.reece.designpatterns.command.model;

public class Stereo {

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCd() {

    }

    public void setDvd() {

    }

    public void setVolume(int volume) {
        System.out.println("Stereo volume is set to " + volume);
    }

    public void setRadio() {

    }
}
