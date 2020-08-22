package com.solid.principle.solution;

public class PowerManagement {
    public enum PowerState {
        ON, OFF
    }

    private RadioSolution radio;

    public PowerManagement(RadioSolution radio) {
        this.radio = radio;
    }

    public void on() {
        if (radio != null && radio.getPowerState() == PowerState.OFF) {
            radio.setPowerState(PowerState.ON);
        }
    }

    public void off() {
        if (radio != null && radio.getPowerState() == PowerState.ON) {
            radio.setPowerState(PowerState.OFF);
        }
    }
}
