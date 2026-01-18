public class FormattingMethod {
    public static void main(String[] args) {
        int age = 25;
        String name = "Angel";
        System.out.printf("Me name is %s and I am %d years old", name, age);

        //%d is for string
        //%s for string
        //%f for floating-point numbers

        System.out.println("-----------");

        double price = 12.475657;
        System.out.printf("The price is %.2f", price);

        System.out.println("-----------");

        System.out.printf("|%10d|", 5);
    }
}
