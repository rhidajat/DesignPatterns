package com.reece.designpatterns.command.model;

public class StereoOnWithCdCommand implements Command {

    Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        this.stereo.on();
        this.stereo.setCd();
        this.stereo.setVolume(11);
    }
}
