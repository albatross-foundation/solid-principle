package com.solid.principle.solution;

public class DisplayManagement {

    private RadioSolution radio;

    public DisplayManagement(RadioSolution radio) {
        this.radio = radio;
    }

    public void displayPowerState() {
        if (radio != null) {
            if (radio.getPowerState() == PowerManagement.PowerState.OFF) {
                System.out.println("Radio has been turned off");
            } else if (radio.getPowerState() == PowerManagement.PowerState.ON) {
                System.out.println("Radio has been turned on");
            }
        }
    }

    public void displayVolume() {
        if (radio != null && radio.getPowerState() == PowerManagement.PowerState.ON) {
            System.out.println("Volume " + radio.getVolume());
        }
    }
}
