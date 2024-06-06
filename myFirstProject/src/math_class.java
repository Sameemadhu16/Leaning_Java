import java.util.Scanner;

public class math_class {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        double p = Math.abs(y); // absolute value
        double q = Math.sqrt(z);

        System.out.println(z);
        System.out.println(p);
        System.out.println(q);

        //find the hyponenuse of a trangle

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a: ");
        a = scanner.nextDouble();

        System.out.println("Enter side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("The hypotenuse is :"+c);

        scanner.close();
    }
    
}
