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


public class CardPaymentProcessor { 
    public String cardNumber;
        public String expiryDate;
        public int cvv;
    public void processCardPayment() {
       int cardLength = this.cardNumber.length();
            if (cardLength == 14) {
                System.out.println("Card accepted");
            } else {
                System.out.println("Invalid card");
                return;
            }
    
            char firstChar = cardNumber.charAt(0);
            int firstCardDigit = Integer.parseInt(String.valueOf(firstChar));
    
            String blacklistedNumber = "01234567890123";
            if (cardNumber.equals(blacklistedNumber)) {
                System.out.println("Card is blacklisted. Please use another card");
            }
            else {
                System.out.println("Card is not blacklisted");
                return;
            }
    
            String lastFourStr = cardNumber.substring(cardLength - 4);
            int lastFourDigits = Integer.parseInt(lastFourStr);
    
            StringBuilder cardNumberToDisplay = new StringBuilder();
            cardNumberToDisplay.append(cardNumber.charAt(0));
            for (int i = 1; i < cardLength - 4; i++) {
                cardNumberToDisplay.append('*');
            }
            cardNumberToDisplay.append(lastFourStr);
    
            System.out.println("First digit of the card: " + firstCardDigit);
            System.out.println("Last four digits of the card: " + lastFourDigits);
            System.out.println("Card number to display: " + cardNumberToDisplay.toString());
        }
    
        public static void main(String[] args) {
            Pizza pizza = new Pizza();
            
           
            
            CardPaymentProcessor processor = pizza.new CardPaymentProcessor();
            processor.cardNumber = "67890123456789";
            processor.expiryDate = "12/26";
            processor.cvv = 456;
            processor.processCardPayment();
        }
    } 
     class SpecialOffer {
     
        public String specialPrice;
        public String pizzaOfTheDay;
        public String sideOfTheDay;
        
        public void specialOfTheDay() {
            this.pizzaOfTheDay = "Margherita Pizza";
            this.sideOfTheDay = "French Fries";
            this.specialPrice = "$10.99";
            
            String result = "Pizza of the day: " + pizzaOfTheDay + "\n";
            result = result + "Side of the day: " + sideOfTheDay + "\n";
            result = result + "Special price: " + specialPrice + "\n";
    
            
            System.out.println(result);
        }
    
        public static void main(String[] args) {
            Pizza pizza = new Pizza();
            SpecialOffer offer = pizza.new SpecialOffer();
            offer.specialOfTheDay();
        }
    }
}        
    
