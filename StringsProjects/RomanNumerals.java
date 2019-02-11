public class RomanNumerals {

    // This method converts a number to Roman numerals.
    // It uses while loops to check if the int is greater than a number. It has to go from greatest to least to work.
    // It adds a letter to an empty string every time the int contains the number corresponding with the Roman numeral.
    public static String intToRoman(int num){
        String rom = "";
        while (num >= 1000){
            rom += "M";
            num -= 1000;
        }
        while (num >= 900){
            rom += "CM";
            num -= 900;
        }
        while (num >= 500){
            rom += "DM";
            num -= 500;
        }
        while (num >= 400){
            rom += "CD";
            num -= 400;
        }
        while (num >= 100){
            rom += "C";
            num -= 100;
        }
        while (num >= 90){
            rom += "XC";
            num -= 90;
        }
        while (num >= 50){
            rom += "L";
            num -= 50;
        }
        while (num >= 40){
            rom += "XL";
            num -= 40;
        }
        while (num >= 10){
            rom += "X";
            num -= 10;
        }
        while (num >= 9){
            rom += "IX";
            num -= 9;
        }
        while (num >= 5){
            rom += "V";
            num -= 5;
        }
        while (num >= 4){
            rom += "IV";
            num -= 4;
        }
        while (num >= 1){
            rom += "I";
            num -= 1;
        }
        return rom;
    }

    // This method converts Roman numerals to a number.
    // It is similar to the method above and uses while loops to see if it contains letter(s) of Roman numerals and add the value corresponding to it.
    // It will repeat until it doesn't contain the given string doesn't contain the Roman numeral. It has to check for the special values first (ex. 4 = IV, 9 = IX) or it won't work correctly.
    public static int romanToInt(String str){
        int value = 0;
        String rom = str;
        while (rom.contains("IV")){
            rom = rom.replaceFirst("IV", "");
            value += 4;
        }
        while (rom.contains("IX")){
            rom = rom.replaceFirst("IX", "");
            value += 9;
        }
        while (rom.contains("XL")){
            rom = rom.replaceFirst("XL", "");
            value += 40;
        }
        while (rom.contains("XC")){
            rom = rom.replaceFirst("XC", "");
            value += 90;
        }
        while (rom.contains("CD")){
            rom = rom.replaceFirst("CD", "");
            value += 400;
        }
        while (rom.contains("CM")){
            rom = rom.replaceFirst("CM", "");
            value += 900;
        }
        while (rom.contains("I")){
            rom = rom.replaceFirst("I", "");
            value += 1;
        }
        while (rom.contains("V")){
            rom = rom.replaceFirst("V", "");
            value += 5;
        }
        while (rom.contains("X")){
            rom = rom.replaceFirst("X", "");
            value += 10;
        }
        while (rom.contains("L")){
            rom = rom.replaceFirst("L", "");
            value += 50;
        }
        while (rom.contains("C")){
            rom = rom.replaceFirst("C", "");
            value += 100;
        }
        while (rom.contains("D")){
            rom = rom.replaceFirst("D", "");
            value += 500;
        }
        while (rom.contains("M")){
            rom = rom.replaceFirst("M", "");
            value += 1000;
        }
       return value;
    }

    // Calls the above methods and converts the inputs.
    public static void main(String args[]){
        System.out.println(intToRoman(1983));
        System.out.println(romanToInt("MCMLXXXIII"));

    }
}
