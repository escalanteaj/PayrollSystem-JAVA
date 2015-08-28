/*
 * *************************************************
 *      Polytechnic University of Puerto Rico      *
 *   Electrical & Computer Engineering Department  * 
 *              Hato Rey, Puerto Rico              *
 *                                                 *
 *         CECS 3210 Advanced Programming          *
 * *************************************************
 * 
 * 
 */
package edu.pupr.payrollSystemTest;

/**
 *Program: <b><code>Employee.java</code></b><br>
 * Date   : 08/27/2015<br>
 * Description:<br>
 *          Abstract class that manages the basic information
 *          concerning each employee. Subclasses are made from Employee
 *          to specify the payroll for each type of employee.<br>
 * 
 * @author Armando J. Escalante - escalanteaj@yahoo.com
 */
public abstract class Employee {
    
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    /**
     * Parameter constructor which receives the first name,
     * the last name and the Social Security Number.
     *
     * @param first
     * @param last
     * @param ssn 
     */
    public Employee(String first, String last, String ssn){
        this.firstName = first;
        this.lastName = last;
        this.socialSecurityNumber = ssn;
    }
    
    /**
     * Accessor of First Name.
     * 
     * @return firstName;
     */
    public String getFirstName(){
        return firstName;
    }
    /**
     * Mutator of First Name.
     * 
     * @param first
     */
    public void setFirstName(String first){
        firstName = first;
    }
    /**
     * Accessor of Last Name.
     * 
     * @return lastName;
     */
    public String getLastName(){
        return lastName;
    }
    /**
     * Mutator of Last Name.
     * 
     * @param last
     */
    public void setLastName(String last){
        lastName = last;
    }
    /**
     * Accessor of Social Security Number
     * 
     * @return socialSecurityNumber
     */
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }
    /**
     * Mutator of Social Security Number
     * 
     * @param ssn
     */
    public void setSocialSecurityNumber(String ssn){
        socialSecurityNumber = ssn;
    }
    
    /**
     * Overloading method toString. 
     * @return 
     */
    @Override
    public String toString(){
        return String.format("%s %s\nSocial Security number: %s",
         getFirstName(), getLastName(), getSocialSecurityNumber());
    }
    /**
     * Abstract method overridden by concrete subclasses
     * @return 
     */
    public abstract double earnings();
    
}
