//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

// ------------main for FoodOrder-----------------------
//    public static void main(String[] args) {
//        FoodOrder order1 = new FoodOrder("1", "Om");
//        order1.addItem("Burger", 200);
//        order1.addItem("Pizza", 300);
//        order1.addItem("Fries", 100);
//        order1.placeOrder();
//
//        FoodOrder order2 = new FoodOrder("2","jack");
//        order2.addItem("icecream",80);
//        order2.addItem("banana",50);
//
//        order1.showOrderDetails();
//        System.out.println();
//        order2.showOrderDetails();
//    }


//----------main for BankAccount -----------------------
//    public static void main(String[] args1, String[] args2){
//        BankAccount account1 = new BankAccount("123", "om");
//        account1.showAccountDetails();
//        System.out.println();
//        account1.deposit(500.01);
//        account1.deposit(300);
//        double currBal=account1.getBalance();
//        System.out.println(currBal);
//        System.out.println();
//        account1.withdraw(200);
//        account1.withdraw(100.5);
//        account1.showAccountDetails();
//    }

// -----------we can have more than one main in Main class , but it should be method overloading
//public class Main {
//
//    public static void main(String[] args) {
//        main(10);
//    }
//
//    public static void main(int x) {
//        System.out.println(x);
//    }
//}
// -------jvm will always call and treat this-> public static void main(String[] args) as entry point

    public static void main(String[] args){
        LibraryBook book1= new LibraryBook("java","om",123);
        book1.printBookDetails();
        System.out.println();
        boolean canBorrow=book1.borrowBook();
        if(canBorrow){
            System.out.println("here is your book");
        }
        else System.out.println("not available");
        System.out.println();
        book1.printBookDetails();
        book1.returnBook();
        System.out.println();
        book1.printBookDetails();

    }
}