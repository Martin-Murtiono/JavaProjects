/*
Martin Murtiono
 */
public class Coins {
    private int c;

    public Coins(int coins){
        c = coins;
    }

    public void calculate(){
        System.out.println(c + " cents =>");
        int q = c / 25;
        System.out.println("Quarter(s)  " + q);
        int qr = c % 25;
        int d = qr / 10;
        System.out.println("Dime(s)  " + d);
        int dr = qr % 10;
        int n = dr / 5;
        System.out.println("Nickel(s)  " + n);
        int nr = dr % 5;
        int p = nr;
        System.out.println("Penny(s)  " + p);
    }

    public static void main (String args[]){
        Coins coins = new Coins(19);
        coins.calculate();
    }
}
