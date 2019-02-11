import java.util.ArrayList;
import java.util.Random;

public class Permutation {
    private ArrayList <Integer> setNums = new ArrayList <>();

    // Constructor
    public Permutation(){}

    // Method
    public void nextPermutation(){
        for (int i = 1; i <= 10; i++){      // Adds numbers 1-10 to the setNums
            setNums.add(i);
        }
        for (int i = setNums.size(); i > 0; i--){       // Repeats for length of list
            int index = new Random().nextInt(i);        // Chooses a random number from 0-i, i starts at 9 and goes down by 1 every loop | This will be the index number of setNums
            int randNum = setNums.get(index);       // Finds the value associated with the index number
            setNums.remove(index);      // Removes that value so it cannot be chosen again
            System.out.print(randNum + " ");        // Prints out all the random numbers in a line
        }
        System.out.print("\n");
    }
}
