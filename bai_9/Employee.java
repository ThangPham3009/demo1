/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06.bai_9;

/**
 *
 * @author HP
 */
public class Employee implements IEmployee,IShow{

    
    private String name;
    
    int PaymentPerHour;

    public Employee(String name, int PaymentPerHour) {
        this.name = name;
        this.PaymentPerHour = PaymentPerHour;
    }

    public int getPaymentPerHour() {
        return PaymentPerHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaymentPerHour(int PaymentPerHour) {
        this.PaymentPerHour = PaymentPerHour;
    }

    
    
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int calculateSalary() {
        return PaymentPerHour;
    }

    @Override
    public void ShowInfo() {
         System.out.printf("Name: %s, salary per day: %d\n", name, calculateSalary());
    }
    
}
