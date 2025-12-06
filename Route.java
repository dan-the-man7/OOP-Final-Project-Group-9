package finalprojectgrp9;

public class Route {

    // Attributes defined
    private int routeID;
    private String routeOrigin;
    private String routeDestination;
    private TransportMode transportMode;
    private double distanceInKm;
    private double vehicleWeightinTonnes;

    // Parameterized Constructor defined
    public Route(int routeID, String routeOrigin, String routeDestination, TransportMode transportMode, double distanceInKm) {
        this.distanceInKm = distanceInKm;
        this.routeDestination = routeDestination;
        this.routeOrigin = routeOrigin;
        this.transportMode = transportMode;
        this.vehicleWeightinTonnes = vehicleWeightinTonnes;
        this.routeID = routeID;
    }

    // Getters and Setters defined
    public String getRouteOrigin() {
        return routeOrigin;
    }

    public void setRouteOrigin(String routeOrigin) {
        this.routeOrigin = routeOrigin;
    }

    public String getRouteDestination() {
        return routeDestination;
    }

    public void setRouteDestination(String routeDestination) {
        this.routeDestination = routeDestination;
    }

    public double getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(double distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public int getRouteID() {
        return routeID;
    }

    public void setRouteID(int routeID) {
        this.routeID = routeID;
    }

    public double getVehicleWeightinTonnes() {
        return vehicleWeightinTonnes;
    }

    public void setVehicleWeightinTonnes(double vehicleWeightinTonnes) {
        this.vehicleWeightinTonnes = vehicleWeightinTonnes;
    }

    
    // Calculates total emissions based on the emission factor, distance in km, and the vehicle weight in tonnes
    public double computeTotalEmissions(TransportMode mode, double distanceInKm, double vehicleWeightinTonnes) {
        return mode.getEmissionFactor() * distanceInKm * vehicleWeightinTonnes;
    }

    @Override
    public String toString() {
        return "Route origin: " + routeOrigin + ", Route destination: " + routeDestination + ", Route distance (in km): " + distanceInKm + " Transport mode: " + transportMode;
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() !=  obj.getClass()) {
            return false;
        }

        Route other = (Route) obj;

        return this.routeID == other.routeID;

    }

    // @Override
    // public int hashCode() {

    // }
    

}
