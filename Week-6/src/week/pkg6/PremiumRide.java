/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg6;

/**
 *
 * @author LARTEK
 */
public class PremiumRide extends Ride {

    private double comfortFee;
    private double surgeMultiplier;

    public PremiumRide(String passengerName, String pickup,
                       String destination, double distanceKm,
                       int durationMin, double pricePerKm,
                       double comfortFee, double surgeMultiplier) {

        super(passengerName, pickup, destination,
                distanceKm, durationMin, pricePerKm);

        this.comfortFee = comfortFee;

        if (surgeMultiplier < 1.0 || surgeMultiplier > 3.0) {
            System.out.println(
                    "Warning: Invalid surge multiplier. Set to 1.0.");
            surgeMultiplier = 1.0;
        }

        this.surgeMultiplier = surgeMultiplier;
    }

    public double getComfortFee() {
        return comfortFee;
    }

    public double getSurgeMultiplier() {
        return surgeMultiplier;
    }

    @Override
    public double calculateFare() {

        double baseFare = super.calculateFare();

        return (baseFare + comfortFee) * surgeMultiplier;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nRide Type: Premium"
                + "\nComfort Fee: " + comfortFee + " TL"
                + "\nSurge Multiplier: " + surgeMultiplier
                + "\nTotal Fare: " + calculateFare() + " TL";
    }
}
