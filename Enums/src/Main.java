//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static void main(String [] args){
//        int totalBill= Coin.Penny.getValue()+Coin.Quater.getValue();
//        System.out.println(totalBill);
//    }
    public static void main(String [] args){
        Order order1= new Order("a01",PaymentMethod.CREDIT_CARD,105.4);
        order1.orderDetails(); //placed
        order1.advanceOrder(); //confirmed
        System.out.println(order1.getOrderStatus());
        order1.advanceOrder(); //shipped
        order1.orderDetails();
        System.out.println(order1.getOrderStatus());
        order1.cancel();
    }
}