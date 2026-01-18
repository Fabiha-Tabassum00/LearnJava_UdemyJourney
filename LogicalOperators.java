public class LogicalOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println(x > 0 && y > 0);   //&& is AND

        int z = -5;
        int w = 10;
        System.out.println(x > 0 || y > 0);   // || is OR

        int k = -5;
        System.out.println(!(k>0));  // ! is NOT

    }    //Precedence--> 1. NOT, 2. AND, 3. OR
}
