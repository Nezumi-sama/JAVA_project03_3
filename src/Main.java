public class Main {
    public static void main(String[] args){
        CreditPaymentService cr = new CreditPaymentService();

        System.out.println(cr.calculate(1, 1000000));
        System.out.println(cr.calculate(2, 1000000));
        System.out.println(cr.calculate(3, 1000000));
    }
}
