import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello, " + name);

        System.out.println("---------------");

        Scanner input2 = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input2.nextInt();
        System.out.println("You entered " + num);

        System.out.println("---------------");

        Scanner input3 = new Scanner(System.in);

        System.out.print("Enter an number: ");
        double num2 = input3.nextDouble();
        System.out.println("You entered " + num2);

        Scanner input4 = new Scanner(System.in);

        System.out.print("Enter an number: ");
        float num3 = input4.nextFloat();
        System.out.println("You entered " + num3);
    }
}
