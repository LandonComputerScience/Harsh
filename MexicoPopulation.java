import java.util.Scanner;

public class MexicoPopulation
{
    public static final double STARTING_POPULATION = 123.8;
    public static final int STARTING_YEAR = 2014;
    public static final double GROWTH_RATE = 0.005;

    public static void main(String[] args)
    {
        new MexicoPopulation();
    }

    public MexicoPopulation()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the target population?");
        double targetPopulation = scan.nextDouble();
        scan.close();
        int year;
        for (year = STARTING_YEAR; STARTING_POPULATION * Math.pow(1 + GROWTH_RATE, year - STARTING_YEAR) < targetPopulation; year++)
        {
        }
        System.out.println("In the year " + year + " Mexico will reach the target population.");
    }
}
