public class App {
    public static void main(String[] args) throws Exception {
        Pizza pizza = new Pizza();
        pizza.takeOrder("DEF_SOH_099", 15.00);
        pizza.makePizza("Mozzarella Cheese", "$15");
       }
}
