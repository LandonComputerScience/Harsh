import java.util.Scanner;

public class PennyForYourThought
{
    public static void main(String[] args)
    {
        new PennyForYourThought();
    }

    public PennyForYourThought()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much money is there in dollars and cents?");
        int money = (int) Math.round(scan.nextDouble());
        scan.close();
        int numSolutions = 0;
        int bestQ, bestD, bestN, bestP;
        bestQ = bestD = bestN = bestP = money;
        for (int nQ = 0; nQ * 25 <= money; nQ++)
        {
            for (int nD = 0; nD * 10 <= money - nQ * 25; nD++)
            {
                for (int nN = 0; nN * 5 <= money - nQ * 25 - nD * 10; nN++)
                {
                    int nP = money - nQ * 25 - nD * 10 - nN * 5;
                    if (nQ + nD + nN + nP < bestQ + bestD + bestN + bestP)
                    {
                        bestQ = nQ;
                        bestD = nD;
                        bestN = nN;
                        bestP = nP;
                    }
                    numSolutions++;
                }
            }
        }
        System.out.println("There are " + numSolutions + " Solutions.");
        System.out.println("The best solution is with " + bestQ + " Quarters, " + bestD + " Dimes, " + bestN + " Nickels, " + bestP + " Pennies.");
    }

}
