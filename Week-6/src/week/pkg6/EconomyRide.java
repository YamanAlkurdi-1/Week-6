/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg6;

/**
 *
 * @author LARTEK
 */
public class EconomyRide extends Ride {

    private double pricePerMinute;

    public EconomyRide(String passengerName, String pickup,
                       String destination, double distanceKm,
                       int durationMin, double pricePerKm,
                       double pricePerMinute) {

        super(passengerName, pickup, destination,
                distanceKm, durationMin, pricePerKm);

        if (pricePerMinute <= 0) {
            System.out.println(
                    "Warning: Invalid price per minute. Set to 1.");
            pricePerMinute = 1;
        }

        this.pricePerMinute = pricePerMinute;
    }

    public double getPricePerMinute() {
        return pricePerMinute;
    }

    @Override
    public double calculateFare() {

        double baseFare = super.calculateFare();

        double timeCharge =
                getDurationMin() * pricePerMinute;

        double totalFare = baseFare + timeCharge;

        if (totalFare < 50) {
            return 50;
        }

        return totalFare;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nRide Type: Economy"
                + "\nPrice per minute: " + pricePerMinute + " TL"
                + "\nTotal Fare: " + calculateFare() + " TL";
    }
}
