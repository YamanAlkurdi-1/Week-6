/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg6;

/**
 *
 * @author LARTEK
 */
public class SharedRide extends EconomyRide {

    private int passengerCount;

    public SharedRide(String passengerName, String pickup,
                      String destination, double distanceKm,
                      int durationMin, double pricePerKm,
                      double pricePerMinute, int passengerCount) {

        super(passengerName, pickup, destination,
                distanceKm, durationMin, pricePerKm, pricePerMinute);

        if (passengerCount < 1 || passengerCount > 4) {
            System.out.println(
                    "Warning: Invalid passenger count. Set to 1.");
            passengerCount = 1;
        }

        this.passengerCount = passengerCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    @Override
    public double calculateFare() {

        // EconomyRide calculates the whole ride fare,
        // including the minimum fare of 50 TL.
        double wholeRideFare = super.calculateFare();

        // Divide the whole ride fare between passengers.
        double farePerPassenger =
                wholeRideFare / passengerCount;

        // Add the 10% service fee.
        return farePerPassenger * 1.10;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nRide Type: Shared"
                + "\nPassenger Count: " + passengerCount
                + "\nFare Per Passenger (including 10% service fee): "
                + calculateFare() + " TL";
    }
}
