import java.util.Random;

public class Rolling
{
    private int numOfSides;         // Number of sides on the die

    public Rolling (int n)          // Constructor that takes in n to set the number of sides of the die
    {
        numOfSides = n;
    }

    public void rollEm()            // Method that counts how many times three n-sided dice must be rolled until the values showing are all different
    {
        boolean equal = true;           // Declares/Instantiates variables
        int count = 0;
        int r1, r2, r3;

        while (equal)           // Conditional
        {
            r1 = (new Random().nextInt(numOfSides))+1;          // Rolls the dice 3 times
            r2 = (new Random().nextInt(numOfSides))+1;
            r3 = (new Random().nextInt(numOfSides))+1;

            if ((r1 != r2) && (r1 != r3) && (r2 != r3))         // Checks to see if the values are all different from each other and changes the conditional
                equal = false;

            count++;                                            // Counts the number of times it takes
            System.out.println(r1 + " " + r2 + " " + r3);           // Prints output
            System.out.println("count = " + count);
        }
    }
}
