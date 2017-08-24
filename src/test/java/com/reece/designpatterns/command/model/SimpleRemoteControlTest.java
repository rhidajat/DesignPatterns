package com.reece.designpatterns.command.model;

import org.junit.Test;

public class SimpleRemoteControlTest {

    @Test
    public void testWithLightOn() {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();

        Command lightOnCommand = new LightOnCommand(light);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
    }
}
