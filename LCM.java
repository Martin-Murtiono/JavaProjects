public class LCM {

    public LCM(){}

    public static int GCF(int a, int b){
        if (a == 0){
            return b;
        } else if (b == 0){
            return a;
        } else {
            while (a != 0 && b != 0){
                if (a > b){
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
        }
        return a;
    }
    public static int leastCommonMultiple(int a, int b){
        int lcm = (a*b)/GCF(a,b);
        return lcm;
    }
}
