/*
Martin Murtiono
 */
public class MortgageCalculator {
    public double principle;
    public double rate;
    public double term;
    public double monthlyPayment;
    public double totalPayment;
    public double totalInterest;

    public MortgageCalculator(){}
    public MortgageCalculator(double amount, double interest, double years){
        principle = amount;
        rate = interest;
        term = years;
    }
    public void calculate(){
        monthlyPayment =(principle*(((rate/12*Math.pow((1 + rate/12),(term * 12))))/((Math.pow((1 + rate/12),(term*12)))-1)));
        totalPayment = (monthlyPayment*(term*12));
        totalInterest = (totalPayment-principle);
        System.out.println("Principle: " + principle);
        System.out.println("Annual Rate: " + rate);
        System.out.println("Number of Years : " + term);
        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payments: " + totalPayment);
        System.out.println("Total Interest: " + totalInterest);
    }

}

