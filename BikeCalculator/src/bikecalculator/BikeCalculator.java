/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikecalculator;

/**
 *
 * @author Orosz
 */
public class BikeCalculator {
    
    public int units = 0; // default is metric;
    public int calcMode = 0; // zero means we calculate velocity, 1 mean power
    public static double[] tireValues = {0.005, 0.004, 0.012};
    public static double[] aeroValues = {0.388, 0.445, 0.420, 0.300, 0.233, 0.200};
    
    private double makeDecimal2 (double value) {
        if (value !=0) {
            double x = Math.round(value * 100);
            int d;
            if ( x < 100) d = 0;
            else d = (int) (x / 100);
            int c = (int) (x % 100);
            String g = (c >= 10)?"":"0";
            value = Double.parseDouble("" + d + "." + g + c);
        }
        return value;
    }
    
    private double makeDecimal0 (double value) {
        if (value != 0) {
            value = Math.round(value);
        }
        return value;
    }
    
    private boolean valDecNumber(String str) { /* returns true if a valid number */
        if (str.length() == 0) return false;
        boolean noNegSignYet = true;
        boolean noPointYet = true;
        for ( int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if (noPointYet && chr == '.') noPointYet = false;
            else if (noNegSignYet && chr == '-') noNegSignYet = false;
		else if (chr< '0' || chr > '9') {
			//alert ("I don't think you want to do that, Dave.");
			return false;
		}
        }
        return true;
    }
    
    private boolean empty(String inputStr) {
        if(inputStr == "" || inputStr == null) return true;
        return false;
    }
    
    public static double newton(double aero, double hw, double tr, double tran, double p) { /* Newton's Method*/
        
        double vel = 20; //Initial guess
        double MAX = 10; //maximum iterations
        double TOL = 0.05;
        
        for (int i = 1; i < MAX; i++) {
            double tv = vel + hw;
            double aeroEff = (tv > 0.0) ? aero : -aero; // wind in fase, must reverse effect
            double f = vel * (aeroEff * tv * tv + tr) - tran * p; //the function
            double fp = aeroEff * (3.0 * vel + hw) *tv + tr; //the derivative
            double vNew = vel - f / fp;
            if (Math.abs(vNew - vel) < TOL) return vNew; // succes
            vel = vNew;
        }
        return 0.0; // failes to converge
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    }
}
