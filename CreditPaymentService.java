import static java.lang.Math.pow;

public class CreditPaymentService {
    public float calculate(float percent, float month) {
        int debt = 1000000;
        float monthpercentannuitet = percent/month/100;
        double coefficient = monthpercentannuitet * pow((1+monthpercentannuitet), month)/(pow((1+monthpercentannuitet), month) - 1);
        double payment;
        payment = coefficient * debt;
        return (float) payment;
    }
}