/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week.pkg6;

import java.util.ArrayList;

/**
 *
 * @author LARTEK 
 */
public class Week6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        ArrayList<Ride> rides = new ArrayList<>();

        // 1. Basic Ride
        Ride ride1 = new Ride(
                "Ali",
                "University",
                "City Center",
                10,
                20,
                5.0
        );

        // 2. Economy Ride
        EconomyRide ride2 = new EconomyRide(
                "Ahmet",
                "University",
                "Airport",
                15,
                30,
                4.0,
                1.5
        );

        // 3. Premium Ride
        PremiumRide ride3 = new PremiumRide(
                "Mehmet",
                "Home",
                "Shopping Mall",
                12,
                25,
                6.0,
                20.0,
                1.5
        );

        // 4. Shared Ride
        SharedRide ride4 = new SharedRide(
                "Ayse",
                "University",
                "Train Station",
                8,
                15,
                3.0,
                1.0,
                4
        );

        // Store every ride in the same ArrayList.
        rides.add(ride1);
        rides.add(ride2);
        rides.add(ride3);
        rides.add(ride4);

        // Print the details and fare of every ride.
        for (Ride ride : rides) {

            System.out.println("==========================");
            System.out.println(ride);
            System.out.printf("Final Fare: %.2f TL%n",
                    ride.calculateFare());
            System.out.println("==========================");
            System.out.println();
        }       




    }
    
}
