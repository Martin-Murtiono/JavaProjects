public class PiggyBank {
    public int pennies;
    public int nickels;
    public int dimes;
    public int quarters;

    public PiggyBank() {
    }

    public PiggyBank(int p, int n, int d, int q){
        pennies = p;
        nickels = n;
        dimes = d;
        quarters = q;
    }

    public void getTotal(){
        double a = ((pennies)+(nickels*5)+(dimes*10)+(quarters*25));
        double total = a/100;
        System.out.println("The total dollar value is: $" + total);
    }

    public void getPennies(){
        System.out.println("Pennies: " + pennies);
    }

    public void getNickels(){
        System.out.println("Nickels: " + nickels);
    }

    public void getDimes(){
        System.out.println("Dimes: " + dimes);
    }

    public void getQuarters(){
        System.out.println("Quarters: " + quarters);
    }

    public void addPennies(int p){
        pennies +=p;
    }

    public void addNickels(int n){
        nickels +=n;
    }

    public void addDimes(int d){
        dimes +=d;
    }

    public void addQuarters(int q){
        quarters +=q;
    }
}
