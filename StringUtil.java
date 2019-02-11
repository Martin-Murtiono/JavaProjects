public class StringUtil {

    // This method reverses a string by using a for loop to scan the inputted string backwards.
    // It finds index numbers of the string going backwards and then adds the character of the current index number to an empty string.
    public static String stringReversal(String input){
        String string = "";
        for (int i = 0; i < input.length(); i++){
            string = string + input.charAt((input.length()-1)-i);
        }
        return string;
    }
    // This method takes an inputted string and removes punctuation, capitalization, and spaces from it.
    // It uses a for loop going up the string's index numbers and scans if the character of the index is a letter.
    // Then it uses a .toLowerCase() method to remove capitalization.
    public static String casePunctWord(String input){
        String string = "";
        for (int i = 0; i <= input.length()-1; i++){
            if (Character.isLetter(input.charAt(i))){
                string += input.charAt(i);
            }
        }
        string = string.toLowerCase();
        return string;
    }

    // This method checks if the given string is equal to itself backwards.
    // It uses the stringReversal method above to reverse the string then checks if it is equal with the given string.
    public static boolean palindrome(String input){
        String a = stringReversal(input);
        if (a.equals(input)){
            return true;
        }
        return false;
    }
}
