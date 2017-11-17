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
public class Employee {
    private String name;
    private String ssn;
    
    public Employee(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }
    public String getName(){
        return name;
    }
    
    public String getSsn(){
        return ssn;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setSsn(String newSsn){
        this.ssn = newSsn;
    }
}
