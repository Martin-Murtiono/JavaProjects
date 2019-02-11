import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> nums = new ArrayList <>();

        // Scans the text file
        File file = new File("H:\\Projects\\ArrayLists\\src\\numbers.txt");
        Scanner sc = new Scanner(file);

        // Adds the text file numbers into an array
        while (sc.hasNextLine()) {
            String num = sc.nextLine();
            int a = Integer.parseInt(num);
            nums.add(a);
        }


        // Finding Average
        double sum = 0;
        for (Integer i : nums){
            sum += i;
        }
        double avg = sum / nums.size();
        System.out.println("Average: " + avg);


        // Finding Standard Deviation

        int sumOfDiff = 0;          // Sum of Difference
        for (Integer i : nums){
            sumOfDiff += Math.pow((i - avg),2);
        }
        double divide = sumOfDiff/(nums.size()-1);          // Step c: Divide by amount of #s - 1
        double stanDev = Math.sqrt(divide);         // Step d: Square root step c
        System.out.println("Standard Deviation: " + String.format("%.2f", stanDev));

        // Finding Mode
        ArrayList<Integer> setOfNums = new ArrayList <>();      // New list to find how many of a number.
        for (int i = 0; i < 100; i++){      // Adds index 0-99 (1-100)
            setOfNums.add(0);
        }
        for (Integer i: nums){      // Counts the amount of times the number was repeated
            int index = i-1;
            setOfNums.set(index,setOfNums.get(index)+1);
        }
        ArrayList<Integer> modes = new ArrayList <>();      // List of modes in case of multiple modes
        int max = Collections.max(setOfNums);       // Finds highest value in ArrayList
        while (Collections.max(setOfNums) == max){      // Converts index number to actual number and adds the number into modes list
            int modeIndex =setOfNums.indexOf(max);
            int mode = modeIndex + 1;
            modes.add(mode);
            setOfNums.set(modeIndex, 0);
        }
        System.out.print("Modes: ");
        for (Integer i : modes){
            System.out.print(i + " ");
        }
    }
} 
