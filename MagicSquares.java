public class MagicSquares{

    public MagicSquares(){}

    public static boolean perfectSquare(int num){
        int i;
        int a;
        for (i = 0; i <= num; i++){
            a = (i*i);
            if (num == a){
                return true;
            }
        }
        return false;
    }

    public static boolean sumOfSeq(int num){
        int a = 0;
        int i;
        for (i = 0; i <= num; i++){
            a = a + i;
            if (a == num){
                return true;
            }
        }
        return false;
    }
    public static void magicSquare(int n){
        int i = 0;
        int times = 0;
        boolean square;
        boolean sequence;
        while (times != n){
            i++;
            square = perfectSquare(i);
            sequence = sumOfSeq(i);
            if (square && sequence){
                System.out.println(i);
                times++;
            }
        }
    }
}