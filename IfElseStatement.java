public class IfElseStatement {
    public static void main(String[] args) {
        int x = 11;   // if-else

        if (x > 10) {
            System.out.println("x is greater than 10");
        }  else {
            System.out.println("x is less than 10");
        }

        System.out.println("----------------");

        int age = 25;  // nested if-else (try not to use too much in codes)
        if (age >= 18) {
            if (age >= 21) {
                System.out.println("You are legal enough to drink.");
            } else  {
                System.out.println("You can vote but you are not legal enough to drink.");
            }
        } else  {
            System.out.println("You are a baby. Stay away from drinks!");
        }

        System.out.println("----------------");

        int a = 10;  // if-else ladder
        int b = 20;

        if (a>b) {
            System.out.println("a is greater than b");
        } else if (a<b) {
            System.out.println("b is greater than a");
        } else {
            System.out.println("a and b are equal");
        }
    }
}
