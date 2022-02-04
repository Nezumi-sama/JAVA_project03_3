public class CreditPaymentService {
    public double calculate(int year, int amount){
     /*   double credit;
       if (year == 1){
            credit = (amount + amount * 0.054932) / 12;
        }else if (year == 2){
            credit = (amount + amount * 0.05368 * 2) / 24;
        }else{
            credit = (amount + amount * 0.0538106666666667 * 3) / 36;
        }*/
     //   double credit = year == 1? (amount + amount * 0.054932) / 12: year == 2? (amount + amount * 0.05368 * 2) / 24: (amount + amount * 0.0538106666666667 * 3) / 36;


        return year == 1? (amount + amount * 0.054932) / 12: year == 2? (amount + amount * 0.05368 * 2) / 24: (amount + amount * 0.0538106666666667 * 3) / 36;

    }
}
