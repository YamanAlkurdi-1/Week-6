/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg6;

/**
 *
 * @author LARTEK
 */

    public class Ride {

    private String passengerName;
    private String pickup;
    private String destination;
    private double distanceKm;
    private int durationMin;
    private double pricePerKm;

    public Ride(String passengerName, String pickup, String destination,
                double distanceKm, int durationMin, double pricePerKm) {

        this.passengerName = passengerName;
        this.pickup = pickup;
        this.destination = destination;

        if (distanceKm <= 0) {
            System.out.println("Warning: Invalid distance. Set to 1.");
            distanceKm = 1;
        }

        if (durationMin <= 0) {
            System.out.println("Warning: Invalid duration. Set to 1.");
            durationMin = 1;
        }

        if (pricePerKm <= 0) {
            System.out.println("Warning: Invalid price per km. Set to 1.");
            pricePerKm = 1;
        }

        this.distanceKm = distanceKm;
        this.durationMin = durationMin;
        this.pricePerKm = pricePerKm;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public double calculateFare() {
        return distanceKm * pricePerKm;
    }

    @Override
    public String toString() {
        return "Passenger: " + passengerName
                + "\nPickup: " + pickup
                + "\nDestination: " + destination
                + "\nDistance: " + distanceKm + " km"
                + "\nDuration: " + durationMin + " minutes"
                + "\nPrice per km: " + pricePerKm + " TL";
    }
}

