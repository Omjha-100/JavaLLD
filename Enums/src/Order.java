import java.util.*;
public class Order {
    private final String orderId;
    private OrderStatus orderStatus;
    private final PaymentMethod paymentMethod;
    private final double amount;

    public Order(String orderId, PaymentMethod paymentMethod, double amount){
        this.orderId=orderId;
        this.orderStatus=OrderStatus.PLACED;
        this.paymentMethod=paymentMethod;
        this.amount=amount;
    }

    public boolean advanceOrder(){
        return switch (orderStatus) {
            case PLACED -> {
                this.orderStatus = OrderStatus.CONFIRMED;
                yield true;
            }
            case CONFIRMED -> {
                this.orderStatus = OrderStatus.SHIPPED;
                yield true;
            }
            case SHIPPED -> {
                this.orderStatus = OrderStatus.DELIVERED;
                yield true;
            }
            default -> false;
        };
    }

    public boolean cancel(){
        if(orderStatus==OrderStatus.PLACED || orderStatus== OrderStatus.CONFIRMED){
            this.orderStatus=OrderStatus.CANCELLED;
            System.out.println("order cancelled");
            return true;
        }
        System.out.println("cannot cancel order");
        return false;
    }

    public double getTotalPrice(){
        return amount+ (amount*paymentMethod.getFeePercent()/100);
    }

    public OrderStatus getOrderStatus(){
        return orderStatus;
    }

    public void orderDetails(){
        System.out.println(this.orderId);
        System.out.println(getOrderStatus());
        System.out.println(this.paymentMethod);
        System.out.println(getTotalPrice());
    }
}
