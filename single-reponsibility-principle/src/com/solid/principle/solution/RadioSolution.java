package com.solid.principle.solution;

public class RadioSolution {
    private PowerManagement.PowerState powerState = PowerManagement.PowerState.OFF;
    private int volume = VolumeManagement.VOLUME_DEFAULT;
    private DisplayManagement displayManagement;
    private VolumeManagement volumeManagement;
    private PowerManagement powerManagement;

    public RadioSolution() {
        displayManagement = new DisplayManagement(this);
        volumeManagement = new VolumeManagement(this);
        powerManagement = new PowerManagement(this);
    }

    public PowerManagement.PowerState getPowerState() {
        return powerState;
    }

    public void setPowerState(PowerManagement.PowerState powerState) {
        this.powerState = powerState;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void powerOn() {
        powerManagement.on();
    }

    public void powerOff() {
        powerManagement.off();
    }

    public void volumeUp() {
        volumeManagement.up();
    }

    public void volumeDown() {
        volumeManagement.down();
    }

    public void displayPowerState() {
        displayManagement.displayPowerState();
    }

    public void displayVolume() {
        displayManagement.displayVolume();
    }
}
