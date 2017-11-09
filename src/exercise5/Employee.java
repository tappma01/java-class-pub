package exercise5;

/**
 * Class Employee
 * Task 3: Create a class Employee with the following private data members: String firstName, String lastName, double salary, boolean fullTime. The string representation of an object of this class depends on the value of the isFullTime member. If an employee is full time, their salary is reported as annual, otherwise it's hourly.
 * @author yasiro01
 */
public class Employee {
    private String firstname;
    private String lastname;
    private double salary;
    private boolean fullTime;


    public Employee(String firstname, String lastname, double salary, boolean fullTime){
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.fullTime = fullTime;
    }

    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public boolean getFullTime(){
        return fullTime;
    }
    public double getSalary() {
        return salary;
    }
    
}
