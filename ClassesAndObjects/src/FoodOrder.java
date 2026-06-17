import java.util.List;
import java.util.ArrayList;

public class FoodOrder {
    private final String orderId;
    private String customerName;
    private List<String> items;
    private boolean isPlaced;
    private double totalAmount;
    public FoodOrder(String orderId, String customerName){
        this.orderId=orderId;
        this.customerName=customerName;
        this.items= new ArrayList<>();
        this.isPlaced= false;
        this.totalAmount=0.0;
    }

    public void addItem(String item, double price){
        if(!isPlaced){
            items.add(item);
            totalAmount=totalAmount+price;
        }
        else{
            System.out.println("cannot add items to placed order, create new order");
        }

    }

    public boolean placeOrder(){
        if(!items.isEmpty()){
            isPlaced=true;
            return true;
        }
        else{
            System.out.println("Cannot place empty order");
            return false;
        }
    }

    public int getItemCount(){
        return items.size();
    }

    public double getTotalAmount(){
        return totalAmount;
    }

    public void showOrderDetails(){
        System.out.println("Order ID: "+orderId);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Items: "+items);
        System.out.println(getItemCount());
        System.out.println("Total Amount: "+getTotalAmount());
        System.out.println("Is Placed: "+isPlaced);
    }
}
