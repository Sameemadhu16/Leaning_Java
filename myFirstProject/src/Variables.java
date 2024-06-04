public class Variables {
    public static void main(String[] args){

        int x = 234; //initialization
        double p = 3.456;
        long y = 2346826397964L;
        boolean z = true; //Only stored true or false
        char symbol = '@'; 
        String name = "Sameera";

        System.out.println("My number is "+x +" and long number is "+y);
        System.out.println(p);
        System.out.println(z);
        System.out.println(symbol);
        System.out.println(name + " is my name");

        //Swap  variable values

        String a = "water";
        String b = "koka cola";
        String temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a: "+a);
        System.out.println("b:"+b);
    }    

}
