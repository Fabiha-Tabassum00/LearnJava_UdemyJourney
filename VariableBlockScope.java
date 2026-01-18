public class VariableBlockScope {
    public static void main(String[] args) {
        int a = 5;

        if (a == 5); {  //block starts here
            int y = 10;  //y has block scope within if statement
            System.out.println(y); //y is accessed here
        }

        //System.out.println(y); //y cannot be accessed here
    }
}
