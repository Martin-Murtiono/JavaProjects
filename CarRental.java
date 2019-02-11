import java.util.Scanner;

public class CarRental{

    // This code converts the given letters and numbers of the license plate to a unique code.
    // It converts the given letters of the license plate into ASCII values and adds them up with the numbers of the license plate to get the number part of the unique code.
    .// Then it divides that value by 26 and finds the remainder. It adds the remainder to the ASCII of A to find the letter of the unique code.
    public static void convertCode(String str, int num){
        char a;
        int ascii = 0;
        for(int i = 0; i <= str.length()-1; i++){
            a = str.charAt(i);
            ascii += (int)a;
        }
        int sum = ascii + num;
        char letter = (char)(65 + (sum%26));
        String code = String.valueOf(letter) + String.valueOf(sum);
        System.out.println(str + " " + num + " = " + code);
    }

    // The main method uses a scanner to find input from the user asking the make, model, and the letters and numbers of the license plate. It will call the method above and find the unique code of it.
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Make:");
        String a = scan.next();
        System.out.println("Enter Model:");
        String b = scan.next();
        System.out.println("Enter License Plate Letters:");
        String c = scan.next();
        System.out.println("Enter License Plate Numbers:");
        int d = scan.nextInt();
        System.out.println("Make = " + a);
        System.out.println("Model = " + b);
        convertCode(c, d);
    }
}