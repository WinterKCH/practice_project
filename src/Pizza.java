public class Pizza {
    public String storeAddress;

    public String storeName;
    public String storeMenu;
    public String storeHours;
    public long storePhone;
    public String pizzaIngredients;
    public String pizzaPrice;
    public String sides;
    public String drinks;
    private String orderID;
    private double orderTotal;

    public void takeOrder(String id,  double total){
        orderID = id;
        orderTotal = total;

        System.out.println("Order accepted!");

        System.out.println("Order is being prepared");

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println("Order is ready for pickup!");
        }

        System.out.println("Your order is ready!");

        printReceipt();


    }

    public void makePizza(String ingredients, String price){
        pizzaIngredients = ingredients;
        pizzaPrice = price;

        System.out.println("Pizza is being made!");

        try{
            Thread.sleep(8000);
        } catch (InterruptedException e){
            System.out.println("Pizza is ready for pickup!");
        }

        System.out.println("Pizza is ready!");

        printReceipt();

    }
    
    private void printReceipt(){
        System.out.println("********RECEIPT********");
        
        System.out.println("Order ID: " + orderID);
        
        System.out.println("Order Total: " + orderTotal);
    }
    
}
