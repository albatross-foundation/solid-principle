package com.solid.principle.solution;

public class VolumeManagement {
    public static final int VOLUME_DEFAULT = 50;
    public static final int VOLUME_MAX = 100;
    public static final int VOLUME_SEEK = 1;
    public static final int VOLUME_MUTE = 0;

    private RadioSolution radio;

    public VolumeManagement(RadioSolution radio) {
        this.radio = radio;
    }

    public void up() {
        if (radio != null) {
            int volume = radio.getVolume();
            if (volume < VOLUME_MAX) {
                radio.setVolume(volume + VOLUME_SEEK);
            }
        }
    }

    public void down() {
        if (radio != null) {
            int volume = radio.getVolume();
            if (volume > VOLUME_MUTE) {
                radio.setVolume(volume - VOLUME_SEEK);
            }
        }
    }
}
