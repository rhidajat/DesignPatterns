package com.reece.designpatterns.command.model;

public class NoCommand implements Command {

    public void execute() {
        System.out.println("no command to run");
    }
}
