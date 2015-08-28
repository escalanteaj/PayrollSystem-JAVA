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
 *Program: <b><code>SalariedEmployee.java</code></b><br>
 * Date   : 08/27/2015<br>
 * Description:<br>
 *          Subclass that extends the class Employee and manages
 *          the salaried employees.<br>
 * 
 * @author Armando J. Escalante - escalanteaj@yahoo.com
 */
public class SalariedEmployee extends Employee
{
    private double weeklySalary;
    
    /**
     * Parameter constructor which receives the First Name,
     * Last Name, Social Security and Salary. 
     * 
     * @param first
     * @param last
     * @param ssn
     * @param salary 
     */
    public SalariedEmployee(String first, String last, String ssn,
            double salary){
        super(first, last, ssn);
        setWeeklySalary(salary);  
    }
    /**
     * Accessor of Salary
     * 
     * @return salary
     */
    public double getWeeklySalary(){
        return weeklySalary;
    }
    /**
     * Mutator of Social Security Number
     * 
     * @param salary
     */
    public void setWeeklySalary(double salary){
        if(salary >= 0.0){
            weeklySalary = salary;
        }else{
            throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");
        }
    }
    
    /**
     * Override of earnings method in Employee
     * 
     * @return 
     */
    @Override
    public double earnings(){
        return getWeeklySalary();
    }
    /**
     * Override of method toString. 
     * @return 
     */
    @Override
    public String toString(){
        return String.format("Salaried employee: %s\n%s: $%,.2f",
            super.toString(), "Weekly salary", getWeeklySalary());
    }    
}
