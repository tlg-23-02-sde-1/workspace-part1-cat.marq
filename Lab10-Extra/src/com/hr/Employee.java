package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS

//    /*
//     * Option 1, try-catch and handle any thrown exception.
//     */
//    public void goToWork() {
//        Car c = new Car("CAT123", "Ford", "F150");
//
//        try {
//            c.start();
//            c.moveTo("West Seattle");
//         } catch (DestinationUnreachableException e) {
//            System.out.println(e.getMessage());
//        }
//        finally {
//            c.stop();
//        }
//    }
//
//    /*
//     * Option 2: Punt
//     */
//        public void goToWork() throws DestinationUnreachableException {
//        Car c = new Car("CAT123", "Ford", "F150");
//        c.start();
//
//        try {
//            c.moveTo("West Seattle");
//    }
//        finally {
//            c.stop();
//        }
//
//    }
//    /*
//     * Option 3: try-catch, respond in some way then re-throw.
//     */
//    public void goToWork() throws DestinationUnreachableException {
//        Car c = new Car("CAT123", "Ford", "F150");
//        c.start();
//
//        try {
//            c.moveTo("West Seattle");
//        }
//        catch (DestinationUnreachableException e) {
//            System.out.println("Email sent to Lisa to complain");
//            throw e;
//        }
//        finally {
//          c.stop();
//        }
//    }
    /*
     * Option 4: try-catch, but then throw a different one.
     * we are nesting the underlying cause exception into a higher level
     * more HR oriented exception for our HRClient
     */
    public void goToWork() throws WorkException {
        Car c = new Car("CAT123", "Ford", "F150");
        c.start();

        try {
            c.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e);
        }
        finally {
          c.stop();
        }
    }


    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}