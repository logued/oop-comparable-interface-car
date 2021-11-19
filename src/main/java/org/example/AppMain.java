package org.example;        // Nov 2021
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AppMain
{
    public static void main(String[] args)
    {
        Car cars[] = new Car[4];
        
        cars[0]= new Car("Toyota","Corolla",1.6);
        cars[1]= new Car("Daihatsu","Diamond",1.4);
        cars[2]= new Car("Nissan","Patrol",2.5);
        cars[3]= new Car("Bugatti","Vyron",4.5);

        // Arrays.sort() will sort Car objects based on their natural ordering.
        // The sort method requires that the objects being sorted must Implement
        // the Comparable interface, and hence must implement
        // the compareTo() method.
        // (Otherwise Compiler objects!)
        Arrays.sort( cars );
        System.out.println("cars array after Arrays.sort( cars )");
        
        for( Car c : cars )
            System.out.println( c );
        
        ArrayList<Car> carList = new ArrayList<Car>();
        
        carList.add(new Car("Toyota","Corolla",1.6));
        carList.add(new Car("Daihatsu","Diamond",1.4));
        carList.add(new Car("Nissan","Patrol",2.5));
        carList.add(new Car("Bugatti","Vyron",4.5));
        
        // Collections.sort() will sort Car objects based on their natural ordering
        // Natural Ordering is dictated by that implemented by the compareTo() method defined
        // in the Car class.
        Collections.sort( carList );
        
        System.out.println("\ncarList ArrayList after Collections.sort( carList )");
    
        for( Car c : carList )
            System.out.println( c );
        
        // 2DO: Rewrite code to sort Car objects based on their Make.
    }  
}
