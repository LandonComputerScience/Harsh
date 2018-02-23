import java.util.Arrays;

public class QuestionsCh9
{
    private static void printArray(double[] anArray) // Printer System//
    {
        System.out.println(Arrays.toString(anArray));
    }
    private static void printArray2(int[] anArray) // Printer System//
    {
        System.out.println(Arrays.toString(anArray));
    }

    public static void main(String[] args)
    {
        int[] tester = { 1, 2, 4 }; // Question #1//
        int[] tester2 = { 1, 4, 4 };
        int[] tester3 = { 0, 3, 5 };
        int[] tester4 = {5};
        System.out.println(tester[0] + ", " + tester[1] + ", " + tester[2] + ". Their sum is: " + adder(tester));
        /*
         * Question #2 (a) False (b) True (c) True (d) True
         */
        // printArray(swapsies(tester)); // Question #3//
        System.out.println("All the Values in the array are not the same:" + samsies(tester)); // Question #4
        System.out.println("The mysteryCount Method counts the number of '0's in the array."); // Question#6
        printArray(quadForm(tester2)); // Question #7
        printArray(quadForm2(tester3)); // Question #8
        printArray2(createWedge(tester4)); //Question #10
        printArray2(fibonacci(tester4)); //Question #11
        System.out.println(averaged(tester)); // Question #17
        //In Question 22, the bug is that int i = 1...int i != 0//
        
        
    }

    public static int adder(int[] anArray)
    {
        int summer = 0;
        for (int i = 0; i < anArray.length; i++)
        {
            summer += anArray[i];
        }
        return summer;
    }

    public static int[] swapsies(int[] anArray)
    {
        int[] newArray = new int[anArray.length];
        for (int i = 1; i < anArray.length - 1; i++)
        {
            newArray[i] = anArray[i];
        }
        newArray[0] = anArray[anArray.length - 1];
        newArray[anArray.length - 1] = anArray[0];
        return newArray;
    }

    public static boolean samsies(int[] anArray)
    {
        for (int i = 0; i < anArray.length - 1; i++)
        {
            if (anArray[i] == anArray[i + 1])
            {
                return false;
            }
        }
        return true;
    }

    public static double[] quadForm(int[] anArray)
    {
        double[] roots = new double[2];
        if (anArray.length != 3)
        {
            throw new IllegalArgumentException("Not a quadratic");
        }
        roots[0] = (int) ((anArray[1] * -1 + Math.sqrt(Math.pow(anArray[1], 2) - 4 * anArray[0] * anArray[2])) * Math.pow(2 * anArray[0], -1));
        roots[1] = (int) ((anArray[1] * -1 - Math.sqrt(Math.pow(anArray[1], 2) - 4 * anArray[0] * anArray[2])) * Math.pow(2 * anArray[0], -1));
        if (anArray[0] == 0)
        {
            throw new IllegalArgumentException("a ==0");
        }
        return roots;
    }

    public static double[] quadForm2(int[] anArray)
    {
        double[] roots = new double[1];
        if (anArray.length != 3)
        {
            throw new IllegalArgumentException("Not a quadratic");
        }
        if (anArray[0] == 0 && anArray[1] == 0 && anArray[2] == 0)
        {
            throw new IllegalArgumentException("Not a quadratic");
        }
        if (anArray[0] == 0)
        {
            roots[0] = (-1 * anArray[2]) * Math.pow(anArray[1], -1);
        }
        else
        {
            quadForm(anArray);
        }
        return roots;
    }
    public static int[] createWedge(int[] anArray){
        int [] palandrome = new int[2 *anArray[0] - 1];
        for(int i = 1; i <= anArray[0]; i++){
            palandrome[i -1] = i;
        }
        for(int i = 1; i< anArray[0]; i++){
            palandrome[anArray[0] + i - 1] = anArray[0] - i;
        }
        return palandrome;
    }
    public static int[] fibonacci(int[] anArray){
        int[] fibonacci = new int[anArray[0] + 2];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i = 2; i <= anArray[0] + 1;i++){          
           fibonacci[i] = fibonacci[i -1] + fibonacci[i -2]; 
        }
        return fibonacci;
    }
    public static double averaged(int[] anArray){
        double count = 0;
        double average = 0;
        for(int i = 0; i < anArray.length; i++){
           count += anArray[i];
        }
        average = count/anArray.length;
        return average;
    }
    public static int[] rotateLeft(int[] anArray){
        int [] rotatedLeft = new int[anArray.length];
        for(int i = 0; i <= anArray.length;i++){
            
        }
        return rotatedLeft;
    }
}
