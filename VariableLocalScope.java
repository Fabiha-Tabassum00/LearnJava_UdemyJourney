public class VariableLocalScope {
    public static void main(String[] args) {
        int x = 5;  // x has local scope within the main method
        System.out.println(x); // x can be accessed here

    } // x is destroyed here
    // System.out.println(x); //x does not exist anymore
}
