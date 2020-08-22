package com.solid.principle.violation;

/*
 * Chúng ta có một lớp Radio thực hiện chức năng: BẬT, TẮT, TĂNG GIẢM âm lượng.
 *
 * */
public class Radio {

    public static final int VOLUME_DEFAULT = 50;
    public static final int VOLUME_MAX = 100;
    public static final int VOLUME_MUTE = 0;
    public static final int VOLUME_SEEK = 1;

    public enum PowerState {
        ON, OFF
    }

    private PowerState powerState = PowerState.OFF;
    private int volume = VOLUME_DEFAULT;

    public PowerState getPowerState() {
        return powerState;
    }

    public void setPowerState(PowerState powerState) {
        this.powerState = powerState;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void powerOff() {
        if (powerState == PowerState.ON) {
            powerState = PowerState.OFF;
        }
    }

    public void powerOn() {
        if (powerState == PowerState.OFF) {
            powerState = PowerState.ON;
        }
    }

    public void volumeUp() {
        if (volume < VOLUME_MAX) {
            volume += VOLUME_SEEK;
        }
    }

    public void volumeDown() {
        if (volume > VOLUME_MUTE) {
            volume -= VOLUME_SEEK;
        }
    }

    public void displayPowerState() {
        if (powerState == PowerState.OFF) {
            System.out.println("Radio has been turned off");
        } else if (powerState == PowerState.ON) {
            System.out.println("Radio has been turned on");
        }
    }

    public void displayVolume() {
        if (powerState == PowerState.ON) {
            System.out.println("Volume " + volume);
        }
    }
}
