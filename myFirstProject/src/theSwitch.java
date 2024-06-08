import java.util.Scanner;

public class theSwitch {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the day of tomorrow:");
        String day = scanner.nextLine();

        switch (day) {
            case "Sunday": System.out.println("It is Sunday");
                break;
            case "Monday": System.out.println("It is Monday");
                break;
            case "Tuesday": System.out.println("It is Tuesday");
                break;
            case "Wendsday": System.out.println("It is Wendsday");
                break;
            case "Thursday": System.out.println("It is Thursday");
                break;
            case "Friday": System.out.println("It is Friday");
                break;
            case "Saturday": System.out.println("It is Saturday");
                break;
            default: System.out.println("It is not a date");
                break;
        }
        scanner.close();
        
    }
    
}
