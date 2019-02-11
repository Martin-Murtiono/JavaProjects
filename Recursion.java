public class Recursion {

    public Recursion(){
    }

    public static int recFib(int n){
        if (n>1){
            return recFib(n-1) + recFib(n-2);
        }
        return n;
    }
    public static int multiply(int m, int n) {
        if (m==0||n==0){
            return 0;
        } else if (m>0&&n>0){
            return m + multiply(m,(n-1));
        }
        return 0;
    }
}
