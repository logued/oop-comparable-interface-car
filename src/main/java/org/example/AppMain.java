package org.example;                           // OOP SD2 Nov 2022
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Demonstrates:
// Sort an Array of objects (Car objects in this case)
// Sort a List of objects  (ArrayList of Car objects in this case)
// Key learning objective is to understand that the class type of objects
// being sorted (here, a Car class) must implement the Comparable Interface,
// and hence must provide a compareTo() method to compare cars on some fields.
//
public class AppMain
{
    public static void main(String[] args)
    {
        Car cars[] = new Car[4];    // create array for 4 Car objects
        
        cars[0]= new Car("Toyota","Corolla",2015,1.6);
        cars[1]= new Car("Daihatsu","Diamond",2008,1.4);
        cars[2]= new Car("Nissan","Patrol",2022, 2.5);
        cars[3]= new Car("Bugatti","Vyron",2020, 4.5);

        // Arrays.sort() will sort Car objects based on their "natural ordering".
        // The library supplied sort() method requires that the objects being sorted
        // must implement the Comparable Interface for the object type (Car here).

        Arrays.sort( cars );
        System.out.println("cars[] array after Arrays.sort( cars )");
        for( Car car : cars )
            System.out.println( car );

        ArrayList<Car> carList = new ArrayList<Car>();
        
        carList.add(new Car("Toyota","Corolla", 2015,1.6));
        carList.add(new Car("Daihatsu","Diamond",2008,1.4));
        carList.add(new Car("Nissan","Patrol",2022,2.5));
        carList.add(new Car("Bugatti","Vyron",2021,4.5));
        
        // Collections.sort() will sort Car objects based on their "natural ordering".
        // There isn't really a "Natural Ordering" for cars, so the designer/programmer
        // must program in an order by writing the compareTo() method in the Car class.

        Collections.sort( carList );
        
        System.out.println("\ncarList ArrayList after Collections.sort( carList )");
        for( Car car : carList )
            System.out.println( car );

        //TODO: Rewrite code to sort Car objects based on their Make.
    }  
}
