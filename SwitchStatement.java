public class SwitchStatement {
    public static void main(String[] args) {
        int day = 13;
        switch (day) {  // switch only works with equality, for single expression
            case 1:
                System.out.println("Day 1: Monday");
                break;  // to break the program instead of letting it continue to run
            case 2:
                System.out.println("Day 2: Tue");
                break;
            case 3:
                System.out.println("Day 3: Wednesday");
                break;
            case 4:
                System.out.println("Day 4: Thursday");
                break;
            case 5:
                System.out.println("Day 5: Friday");
                break;
            case 6:
                System.out.println("Day 6: Saturday");
                break;
            case 7:
                System.out.println("Day 7: Sunday");
                break;
            default:
                System.out.println("Invalid Day");

        System.out.println("----------------");

        int month = 3;
        String monthString = "";
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            default:
                monthString = "Invalid Month";
                break;
        }
        System.out.println(monthString);
        }
    }
}
