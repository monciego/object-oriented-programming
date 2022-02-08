import java.util.Scanner;
public class calculateinterest
{
    public static void main(String [] args)
    {
        calculateInterest(1000.0,0.04);
        calculateInterest(1000.0,5);
        calculateInterest(1000,0.06);
        calculateInterest(1000,7);
    }
    public static void calculateInterest(double bal, double rate)
    {
        double interest;
        interest = bal * rate;
        System.out.println("Simple interest on $" +bal+ " at "+
                    (int)(rate)+ "% is " +(double)interest);
    }
    public static void calculateInterest( double bal, int rate)
    {
        double interest, rateAsPercent;
        rateAsPercent = rate / 100.0;
        interest = bal * rateAsPercent;
        System.out.println("Simple interest on $" +bal+ " at "+
                    (int)(rate)+ "% is " +(double)interest);
    }
}
    