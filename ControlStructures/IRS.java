public class IRS {
    public int Status;
    public double Income;
    public IRS (int status, double income){
        Status = status;
        Income = income;
    }
    public String findStatus(){
        String single = "Single";
        String married = "Married";
        if (Status == 1){
            return single;
        }
        return married;
    }
    public double findIncome(){
        return Income;
    }
    public double fedTax(){
        double b = 0;
        if (Status == 1){
            if (Income > 0 && Income < 27049){
                b = .15*(Income);
            } else if (Income > 27050 && Income < 65549){
                b = 4057.5 + (.275*(Income - 27050));
            } else if (Income > 65550 && Income < 136749){
                b = 14645 + (.305*(Income - 65550));
            } else if (Income > 136750 && Income < 297349){
                b = 36361 + (.355*(Income - 136750));
            } else if (Income > 297350){
                b = 93374 + (.391*(Income - 297350));
            }
        } else if (Status == 2){
            if (Income > 0 && Income < 45199){
                b = .15*(Income);
            } else if (Income > 45200 && Income < 109249){
                b = 6780 + (.275*(Income - 45200));
            } else if (Income > 109250 && Income < 166499){
                b = 24393.75 + (.305*(Income - 109250));
            } else if (Income > 166500 && Income < 297349){
                b = 41855 + (.355*(Income - 166500));
            } else if (Income > 297350){
                b = 88306 + (.391*(Income - 297350));
            }
        }
        return b;
    }
}
