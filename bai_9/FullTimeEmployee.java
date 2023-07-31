
package com.actvn.java06.bai_9;


public class FullTimeEmployee extends Employee{

     public FullTimeEmployee(String name,int PaymentPerHour)
     {
         super(name, PaymentPerHour);
     }

    @Override
    public int calculateSalary() {
        return PaymentPerHour*8;
    }
     
}
