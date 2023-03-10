/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24),
                97.0));
        dept.addEmployee(new SalariedEmployee("Julie", LocalDate.of(2000, 2, 2),
                80.0));
        dept.addEmployee(new SalariedEmployee("Bob", LocalDate.of(2022, 2, 2) ,
                66.5));
        dept.addEmployee(new HourlyEmployee("Cindy", LocalDate.of(2023, 1, 15),
                25.0, 40.0));
        dept.addEmployee(new Executive("Cat", LocalDate.of(1990, 6, 1),
                115.0));


        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        System.out.println("\nPay employees:");
        dept.payEmployees();
    }
}