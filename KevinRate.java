
public class KevinRate
{

    public static void main(String[] args)
    {
        new KevinRate();
    }

    public KevinRate()
    {
        double knowledge = 0;
        int months = 0;
        while (knowledge < .95)
        {
            knowledge += (1 - knowledge) * .1;
            months++;
        }
        System.out.println("It took Kevin " + months/12 + " years and " + (months%12) + " months to prepare.");
    }

}
