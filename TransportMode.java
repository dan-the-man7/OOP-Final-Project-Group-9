package finalprojectgrp9;

public enum TransportMode {


    // Constants defined for emission factors in kilograms of carbon dioxide equivalent(kgCO2e) and average speed in km/h of various transport modes
    AIR(0.5,800, "Air"),
    ROAD_TRUCK(0.1, 70, "Road (Truck)"),
    ROAD_EVTRUCK(0.04, 70, "Road (Electric Truck)"),
    RAIL(0.03, 120, "Rail"),
    SEA_SHIP(0.01, 30, "Sea (Ship)");

    // Attributes defined
    private final double emissionFactor;
    private final int averageVehicleSpeed;
    private String transportMode;

    // Constructor defined
    TransportMode(double emissionFactor, int averageVehicleSpeed, String transportMode) {
        this.averageVehicleSpeed = averageVehicleSpeed;
        this.emissionFactor = emissionFactor;
        this.transportMode = transportMode;
    }

    // Getters defined to return emission factor, vehicle speed, and transport mode
    public double getEmissionFactor() {
        return emissionFactor;
    }

    public int getAverageVehicleSpeed() {
        return averageVehicleSpeed;
    }

    public String getTransportMode() {
        return transportMode;
    }

}
