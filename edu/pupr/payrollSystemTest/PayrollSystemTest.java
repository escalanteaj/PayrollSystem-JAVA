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
 *Program: <b><code>PayrollSystemTest.java</code></b><br>
 * Date   : 08/27/2015<br>
 * Description:<br>
 *          This class manages the payroll system which includes:<br>
 *          1) Hourly employees<br>
 *          2) Commission employees<br>
 *          3) Commission plus Salary employees<br>
 *          4) Salaried employees<br>
 *          5) Piece Worker employees<br>
 *          
 * 
 * @author Armando J. Escalante - escalanteaj@yahoo.com
 */
public class PayrollSystemTest
{
    public static void main(String[] args){
        SalariedEmployee salariedEmployee = 
            new SalariedEmployee("John", "Smith", "111-11-1111", 1800.00);
        HourlyEmployee hourlyEmployee =
            new HourlyEmployee( "Karen", "Price", "222-22-2222", 26.75, 40);
        CommissionEmployee commissionEmployee =
            new CommissionEmployee(
                    "Sue", "Jones", "333-33-3333", 25000.00, 0.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee =
            new BasePlusCommissionEmployee(
                    "Bob", "Lewis", "444-44-4444", 17500, 0.04, 850.00);
        PieceWorker pieceWorkerEmployee =
            new PieceWorker(
                    "LeBron", "James", "555-55-5555", 25.50, 98);
        
        System.out.println( "Employees processed individually:\n");
        
        System.out.printf( "%s\n%s: $%,.2f\n\n",
                salariedEmployee, "Earned", salariedEmployee.earnings());
        System.out.printf( "%s\n%s: $%,.2f\n\n",
                hourlyEmployee, "Earned", hourlyEmployee.earnings());
        System.out.printf( "%s\n%s: $%,.2f\n\n",
                commissionEmployee, "Earned", commissionEmployee.earnings());
        System.out.printf( "%s\n%s: $%,.2f\n\n",
                basePlusCommissionEmployee,
                "Earned", basePlusCommissionEmployee.earnings());
        System.out.printf( "%s\n%s: $%,.2f\n\n",
                pieceWorkerEmployee, "Earned", pieceWorkerEmployee.earnings());
                
        Employee[] employees = new Employee[5];
        
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceWorkerEmployee;
        
        System.out.println( "Employees processed polymorphically:\n");
        
        for (Employee currentEmployee : employees){
            System.out.println(currentEmployee);
            
            if(currentEmployee instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee employee =
                        (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary( 1.10 * employee.getBaseSalary());
                
                System.out.printf(
                    "New base salary with 10%% increase is: $%,.2f\n",
                         employee.getBaseSalary());   
            } // end of if
            System.out.printf(
                    "Earned $%,.2f\n\n", currentEmployee.earnings());
        } // end of for
        for(int j = 0; j < employees.length; j++){
            System.out.printf("Employee %d is a %s\n", j,
                    employees[j].getClass().getName());
        }
    }        
}
