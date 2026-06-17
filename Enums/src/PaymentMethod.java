public class PaymentMethod {
    public static final PaymentMethod CREDIT_CARD= new PaymentMethod("Credit Card",1.5);
    public static final PaymentMethod DEBIT_CARD= new PaymentMethod("Debit Card", 1);
    public static final PaymentMethod UPI= new PaymentMethod("UPI", 0.0);

    private final String name;
    private final double feePercent;

    private PaymentMethod(String name, double feePercent){
        this.name=name;
        this.feePercent=feePercent;
    }

    public String getName(){
        return this.name;
    }

    public double getFeePercent(){
        return this.feePercent;
    }

    public void paymentMethodDetails(){
        System.out.println(this.name);
        System.out.println(this.feePercent);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString(){
        return name;
    }
}
