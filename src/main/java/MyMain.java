import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {

        //ask for user input name and create welcome statement
        Scanner scan = new Scanner(System.in);        
        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("Hello, " + name + "! It's nice to meet you!");

        //ask for user input favorite number and create statement
        System.out.println(" What is your favorite number?");
        String number = scan.next();
        int numbernum = Integer.parseInt(number);
        int num2 = numbernum + 8;
        System.out.println(" Your number plus eight is " + num2 + ".");

        //ask for user favorite color and create statement
        System.out.println(" What is your favorite color?");
        String color = scan.next();
        System.out.println(" I don't really like " + color + ". It makes me feel sad.");

        //ask for user favorite food and create statement
        System.out.println(" What is your favorite food?");
        String food = scan.next();
        System.out.println(" I also enjoy eating " + food + ". However, sometimes it makes me feel ill.");

         //ask for user favorite animal and create statement
        System.out.println(" What is your favorite animal?");
        String animal = scan.next();
        System.out.println(" Ahhhhhhh! I think " + animal + "s are really scary!");

        scan.close();
    }
}
