package ru.sbt.mipt.smarthome.events;


public class DoorUnlocked implements SensorEvent {
    private final String deviceId;


    public DoorUnlocked(String deviceId) {
        if (deviceId == null) {
            throw new IllegalArgumentException("Id cannot be null.");
        }
        this.deviceId = deviceId;
    }


    @Override
    public String getComponentId() {
        return deviceId;
    }
}
