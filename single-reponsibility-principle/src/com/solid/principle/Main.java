package com.solid.principle;

import com.solid.principle.solution.RadioSolution;
import com.solid.principle.violation.RadioViolation;

public class Main {

    public static void main(String[] args) {
        // Violation
        RadioViolation radio = new RadioViolation();
        radio.displayPowerState();
        radio.displayVolume();
        radio.powerOn();
        radio.volumeUp();
        radio.displayPowerState();
        radio.displayVolume();

        // Solution
        RadioSolution radioSolution = new RadioSolution();
        radioSolution.displayPowerState();
        radioSolution.displayVolume();
        radioSolution.powerOn();
        radioSolution.volumeUp();
        radioSolution.displayPowerState();
        radioSolution.displayVolume();
    }
}
