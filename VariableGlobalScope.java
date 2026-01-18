public class VariableGlobalScope {
    public static int x = 5; //x has global scope
    public static void main(String[] args) {
        System.out.println(x); //x is accessed here
    }

    public static void someMethod() {
        System.out.println(x); //also here
    }
}
