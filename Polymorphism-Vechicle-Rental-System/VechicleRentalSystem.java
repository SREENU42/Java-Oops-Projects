// ✅ 4️⃣ Vehicle Rental System

// Concepts: Overriding, polymorphism, business logic variation
// Description:
// Create abstract class Vehicle with:
// rentPricePerDay()
// fuelType()
// Child classes:
// Car
// Bike
// Truck
// Each must override price calculation and fuel type.
// Main:
// Ask for number of days, calculate total rental amount using polymorphic calls.

import java.util.Scanner;

abstract class Vechicle{
    abstract double rentPricePerDay();
    abstract String fuelType();

    double calculateTotalRent(int days){
        return rentPricePerDay()*days;
    }
}

class Car extends Vechicle{
    @Override
    double rentPricePerDay(){
        return 1500.0;
    }
    @Override
    String fuelType(){
        return "petrol/Diesel";
    }

}
class Bike extends Vechicle{
    @Override 
    double rentPricePerDay(){
        return 800.0;
    }
    @Override
    String fuelType(){
        return "petrol";
    }

}
class Truck extends Vechicle{
    @Override
    double rentPricePerDay(){
        return 3000.0;
    }
    @Override
    String fuelType(){
        return "Diesel";
    }

}
public class VechicleRentalSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vechicle []vechicles={new Car(),new Bike(),new Truck()};

        String []vechicleNames={"Car","Bike","Truck"};

        System.out.println("\nEnter No of rental Days:");
        int days=sc.nextInt();

        System.out.println("==========Rental Days=========");
            for (int i = 0; i < vechicles.length; i++) {
            Vechicle v = vechicles[i];
            System.out.println(vechicleNames[i] + ":");
            System.out.println("Fuel Type: " + v.fuelType());
            System.out.println("Rent per day: " + v.rentPricePerDay());
            System.out.println("Total Rent for " + days + " days: " + v.calculateTotalRent(days));
            System.out.println("---------------------------");
        }

        sc.close();
    }
}
