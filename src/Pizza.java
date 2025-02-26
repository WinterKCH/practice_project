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

    public static final String DEF_ORDER_ID = "DEF-SOH-099";
    public static final double DEF_ORDER_TOTAL = 15.00;
    public static final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";

    public Pizza(){
        this.pizzaIngredients = DEF_PIZZA_INGREDIENTS;
        this.orderID = DEF_ORDER_ID;
        this.orderTotal = DEF_ORDER_TOTAL;
        this.drinks = "Cola";
        this.sides = "Bread";
    }

    public String getpizzaIngredients(){
        return pizzaIngredients;
    }
    public void setPizzaIngredients(String pizzaIngredients){
        this.pizzaIngredients = pizzaIngredients;
    }

    public String getorderID(){
        return orderID;
    }
    public void setOrderID(String orderID){
        this.orderID = orderID;
    }

    public double getorderTotal(){
        return orderTotal;
    }
    public void setOrderTotal(double orderTotal){
        this.orderTotal = orderTotal;
    }

    public String getDrinks(){
        return drinks;
    }
    public void setDrinks(String drinks){
        this.drinks = drinks;
    }

    public String getSides(){
        return sides;
    }
    public void setSides(String sides){
        this.sides = sides;
    }

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
            Thread.sleep(5000);
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

        System.out.println("Pizza Ingredients: " + pizzaIngredients);

        System.out.println("Sides: " + sides);

        System.out.println("Drinks: " + drinks);
    }

    public void showReceipt(){
        printReceipt();
    }
    
}
