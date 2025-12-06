package finalprojectgrp9;

import java.util.ArrayList;

public class Supplier {
    
    private String supplierLocation;
    private double carbonRating;
    private double distance;
    private String supplierName;
    private ArrayList<String> productsSupplied;


    // Paramterized constructor created for supplier objects with parameters of 
    public Supplier(String supplierName, String supplierLocation, ArrayList<String> productsSupplied, double distance, double carbonRating) {

        this.supplierName = supplierName;
        this.supplierLocation = supplierLocation;
        this.productsSupplied = productsSupplied;
        this.carbonRating = carbonRating;
        this.distance = distance;

    }

    // Getters created for Supplier class

    public void setSupplierName (String supplierName) {
        this.supplierName = supplierName;
    }

    public void setLocation (String supplierLocation) {
        this.supplierLocation = supplierLocation;
    }

    public void setDistance (double distance) {
        this.distance = distance;
    }

    public void setCarbonRating (double carbonRating) {
        this.carbonRating = carbonRating;
    }

    public void setproductsSupplied (ArrayList<String> productsSupplied) {
        this.productsSupplied = productsSupplied;
    }

    // Getters created for Supplier class
    
    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierLocation() {
        return supplierLocation;
    }

    public ArrayList<String> getProductsSupplied() {
        return productsSupplied;
    }
    
    public double getCarbonRating() {
        return carbonRating;
    }

    public double getDistance() {
        return distance;
    }  

    // toString() method overriden to display supplier details.
    @Override

    public String toString() {
        return "Supplier Name: " + supplierName + ", Supplier Location: " + supplierLocation + ", Supplier Carbon Rating: " + carbonRating;
    }

    // Equals method overriden to check if two suppliers are equal based on their name and location.

    @Override

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Supplier other = (Supplier)obj;

        return this.supplierName.equals(other.supplierName) && this.supplierLocation.equals(other.supplierLocation);
    }

    // HashCode() Method Overriden
    @Override

    public int hashCode() {
        int hash = 7;

        hash = 31 * hash + (int)carbonRating;
        hash = 31 * hash + (int)distance;
        hash = 31 * hash + (supplierLocation == null ? 0 : supplierLocation.hashCode());
        hash = 31 * hash + (supplierName == null ? 0 : supplierName.hashCode());

        return hash;

    }
}   
