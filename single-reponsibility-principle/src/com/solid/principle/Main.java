package com.solid.principle;

import com.solid.principle.violation.Radio;

public class Main {

    public static void main(String[] args) {
        // Violation
        Radio radio = new Radio();
        radio.displayPowerState();
        radio.displayVolume();
        radio.powerOn();
        radio.volumeUp();
        radio.displayPowerState();
        radio.displayVolume();

        // Solution

    }
}
