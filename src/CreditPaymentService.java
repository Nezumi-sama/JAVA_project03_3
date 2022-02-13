public class CreditPaymentService {
    public int calculate(int year, int amount) {
        int credit;
        if (year == 1) {
            credit = (int) (amount + amount * 0.054932) / 12;
        } else if (year == 2) {
            credit = (int) (amount + amount * 0.05368 * 2) / 24;
        } else {
            credit = (int) (amount + amount * 0.0538106666666667 * 3) / 36;
        }

        return credit;
    }
}
