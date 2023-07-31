
package com.actvn.java06.bai_9;


public class PartTimeEmployee extends Employee{
    int workingHours;

    public PartTimeEmployee(int workingHours, String name, int PaymentPerHour) {
        super(name, PaymentPerHour);
        this.workingHours= workingHours;
    }

    @Override
    public int calculateSalary() {
        return super.PaymentPerHour*workingHours;
    }    
    
    
    
   
    
}
