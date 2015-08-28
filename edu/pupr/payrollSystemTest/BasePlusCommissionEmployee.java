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
 *Program: <b><code>BasePlusCommissionEmployee.java</code></b><br>
 * Date   : 08/27/2015<br>
 * Description:<br>
 *          Subclass that extends the class CommissionEmployee and 
 *          adds the base salary to the employee.<br>
 * 
 * @author Armando J. Escalante - escalanteaj@yahoo.com
 */
public class BasePlusCommissionEmployee extends CommissionEmployee
{
    private double baseSalary;
    
    /**
     * Parameter constructor which receives the First Name, Last Name,
     * Social Security number, number of sales, rate per sale and base salary.
     * 
     * @param first
     * @param last
     * @param ssn
     * @param sales
     * @param rate
     * @param salary 
     */
    public BasePlusCommissionEmployee(String first, String last, String ssn,
            double sales, double rate, double salary){
        super(first, last, ssn, sales, rate);
        setBaseSalary(salary);
    }
    
    /**
     * Mutator of Base Salary
     * 
     * @param salary 
     */
    public void setBaseSalary(double salary){
        if(salary >= 0.0){
            baseSalary = salary;
        }else{
            throw new IllegalArgumentException(
            "Base salary must be >= 0.0");
        }
    }
    /**
     * Accessor of Base Salary
     * 
     * @return 
     */
    public double getBaseSalary(){
        return baseSalary;
    }
    
    /**
     * Override of earnings method in CommissionEmployee
     * 
     * @return 
     */
    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }
    /**
     * Override of method toString
     * @return 
     */
    @Override
    public String toString(){
        return String.format("%s %s; %s: $%,.2f",
                "Base-salaried", super.toString(),
                "Base salary", getBaseSalary());
    }
}
