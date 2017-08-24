package com.reece.designpatterns.command.model;

public class LightOffCommand implements Command {

    private Light light;

    public void setLight(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.on();
    }
}

