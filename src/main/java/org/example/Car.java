package org.example;

// In order to be able to sort an array or list of Car objects,
// the Arrays.sort() and Collections.sort() methods require that the
// Car class :
// 1. implements the Comparable<T> interface, and consequently that
// 2. the compareTo() method is written in the Car class
//

public class Car implements Comparable<Car>
{
    private String make;    //e.g. Toyota
    private String model;   // Corolla
    private int year;
    private double engineSize;   // e.g.  1.6  litre

    public Car( String make, String model, int year, double engineSize ) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.engineSize = engineSize;
    }

    // Once we declare that Car implements the Comparable interface:
    //     "class Car implements Comparable<Car>"
    // Then we must actually implement (write code for) the
    // compareTo() method.
    // Here, we have decided to compare Car objects based on engineSize.
    // This defines the so-called 'natural ordering' for Car objects.
    // When we use Arrays.sort() on an array of Car objects, then
    // the array will be sorted based on year.

    // Note that we are overriding the compareTo() method that is defined
    // in the Comparable<T> interface defined in the Java API.
    
    @Override
    public int compareTo( Car otherCar ) {
        
        if( this.year < otherCar.year )        // will result in ascending order
            return -1;
        else if( this.year == otherCar.year)
            return 0;
        else
            return 1;

        // The above logic could also be implemented as
        // "  return this.year - otherCar.year; "
    }

    //TODO Modify this class so that Cars are sorted based on their Make field.
    // Note that when using Comparable, only one ordering can be in place at any one time.

    @Override
    public String toString()
    {
        return getClass().getSimpleName() + "{" + "make=" + make 
                + ", model=" + model + ", year=" + this.year +", engineSize=" + engineSize + '}';
    }
}
