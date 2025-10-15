package org.example;                           // OOP Oct 2025
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Demonstrates:
// Sort an Array or List of objects (Car objects in this case)
// Key learning objective is to understand that the class type of objects in the list
// being sorted (here, a Car class) must implement the Comparable Interface,
// and hence must provide a compareTo() method to compare cars on some specified field(s).
// This is what is called the "Natural Ordering" of the elements in the list.
//
public class AppMain
{
    public static void main(String[] args)
    {
        Car[] cars = new Car[4];    // create array for 4 Car objects
        
        cars[0]= new Car("Toyota","Corolla",2015,1.6);
        cars[1]= new Car("Daihatsu","Diamond",2008,1.4);
        cars[2]= new Car("Nissan","Patrol",2022, 2.5);
        cars[3]= new Car("Bugatti","Vyron",2020, 4.5);

        // Arrays.sort() will sort Car objects based on their "natural ordering".
        // The library supplied sort() method requires that the objects being sorted
        // must implement the Comparable Interface for the object type (Car here),
        // and hence, must have a compareTo() method implemented.

        Arrays.sort( cars );  // order depends on the compareTo() method

        System.out.println("cars[] array after Arrays.sort( cars )");
        System.out.println("Cars should be in ascending order of year, as defined by the compareTo() method.");
        for( Car car : cars )
            System.out.println( car );

        ArrayList<Car> carList = new ArrayList<Car>();
        
        carList.add(new Car("Toyota","Corolla", 2015,1.6));
        carList.add(new Car("Daihatsu","Diamond",2008,1.4));
        carList.add(new Car("Nissan","Patrol",2022,2.5));
        carList.add(new Car("Bugatti","Vyron",2021,4.5));
        
        // Collections.sort() will sort Car objects based on their "natural ordering".
        // There isn't really a "Natural Ordering" for cars, so the designer/programmer
        // must program in a 'natural order' by writing the compareTo() method in the Car class
        // to define that ordering.

        Collections.sort( carList );
        
        System.out.println("\ncarList ArrayList after Collections.sort( carList )");
        System.out.println("Cars should be in ascending order of year, as defined by the compareTo() method.");
        for( Car car : carList )
            System.out.println( car );

        //TODO: Rewrite code so that the Natural Ordering of Car elements becomes
        // - in ascending order of Make.
        // You can comment out the existing compareTo() method and replace it with
        // your new code.  Only one compareTo() method can exist in Car.
    }  
}
