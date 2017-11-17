/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author tappma01
 */
public class SalariedEmployee extends Employee {
    private double salary;
    
    public SalariedEmployee(String name, String ssn, double salary){
        super(name, ssn);
        this.salary = salary;
    }
    
    public double getSalary(){
        return salary;    
    }
    
    public void setSalary(double newSalary){
        this.salary = newSalary;
    }
    
    public void printWeeklyCheck(){
        System.out.print(salary / 52);
    }
    
    
}
