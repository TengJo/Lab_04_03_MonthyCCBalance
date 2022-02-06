public class Main
{

    public static void main(String[] args)
    {
	double creditCardBalance;
    double interestRate;
    double oneMonthInterest;
    double twoMonthInterest;
        creditCardBalance = 5000;
        interestRate = .17;
        oneMonthInterest = creditCardBalance * interestRate;
        twoMonthInterest = oneMonthInterest * interestRate;
        System.out.println("The first month's interest is " + oneMonthInterest);
        System.out.println("The second month's interest is " + twoMonthInterest);
    }
}
