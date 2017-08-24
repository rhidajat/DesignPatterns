package com.reece.designpatterns.command.model;

public class GarageDoorOpenCommand implements Command {

    Garage garage;

    public GarageDoorOpenCommand(Garage garage) {
        this.garage = garage;
    }

    public void execute() {
        this.garage.open();
    }
}
