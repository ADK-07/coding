
public class OverloadMethod {
    public static void main(String[] args) {
        String pizza = bakePizza("flat bread");
        String pizza1 = bakePizza("flat bread", "mizzapotim");
        String pizza2 = bakePizza("flat bread", "mizzapotim", "papprioni");
        System.out.println(pizza);
        System.out.println(pizza1);
        System.out.println(pizza2);
    }

    static String bakePizza(String bread) {

        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese) {

        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping) {

        return topping + " " + cheese + " " + bread + " pizza";
    }
    
    
    
}
