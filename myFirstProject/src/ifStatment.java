import java.util.Scanner;

public class ifStatment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age:");
        int age = scanner.nextInt();

        if(age>=18 && age<75){
            System.out.println("You are an adult");
        }
        else if(age >= 75){
            System.out.println("You are a old one");
        }
        else if(age >= 14 && age < 18){
            System.out.println("You are a teenager");
        }
        else if (age < 14){
            System.out.println("You are a child!");
        }
        else{
            System.out.println("You are not an adult");
        }

        scanner.close();
    }
    
}
