public class Main {
    public static void main(String[] args) {
        float percent = (float)9.99;
        int month = 24;
            CreditPaymentService service = new CreditPaymentService();
            float payment = service.calculate(percent, month);
            System.out.println((int)payment);
    }
}
