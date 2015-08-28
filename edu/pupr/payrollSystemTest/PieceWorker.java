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
 *Program: <b><code>PieceWorker.java</code></b><br>
 * Date   : 08/27/2015<br>
 * Description:<br>
 *          Subclass that extends the class Employee and manages
 *          the employees whose pay is based on the number of
 *          pieces of merchandise produced.<br>
 * 
 * @author Armando J. Escalante - escalanteaj@yahoo.com
 */
public class PieceWorker extends Employee{
    private double wage;
    private double pieces;
    
    /**
     * Parameter constructor which receives the First Name, Last Name,
     * Social Security number, number of pieces produced and
     * the wage per piece produced.
     * 
     * @param first
     * @param last
     * @param ssn
     * @param wage
     * @param pieces 
     */
    public PieceWorker(String first, String last, String ssn,
            double wage, double pieces){
        super(first, last, ssn);
        setWage(wage);
        setPieces(pieces);
    }
    
    /**
     * Mutator of wage per piece produced.
     * 
     * @param wagePerPiece 
     */
    public void setWage(double wagePerPiece){
        if(wagePerPiece >= 0.0){
            wage = wagePerPiece;
        }else{
            throw new IllegalArgumentException(
            "Wage per piece produced must be >= 0.0");
            }
    } 
    /**
     * Accessor of wage per piece produced.
     * @return 
     */
    public double getWage(){
        return wage;
    }
    /**
     * Mutator of pieces produced.
     * 
     * @param piecesProduced 
     */
    public void setPieces(double piecesProduced){
        if((piecesProduced >= 0.0) &&(piecesProduced <= 100.0)){
            pieces = piecesProduced;
        }else{
            throw new IllegalArgumentException(
            "Pieces produced must be >= 0.0 and <= 100.0");
            }
    }
    /**
     * Accessor of pieces produced.
     * @return 
     */
    public double getPieces(){
        return pieces;
    }
    
    /**
     * Override of abstract earnings method in Employee.
     * @return 
     */
    @Override
    public double earnings(){
        return getWage()*getPieces();
    }
    /**
     * Override of toString method.
     * 
     * @return 
     */
    @Override 
    public String toString(){
        return String.format("Piece worker: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "Wage", getWage(),
                "Pieces produced", getPieces());
    }
    

}
