import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, welcome to the theater, please enter your age:");
        int age = in.nextInt();
        if (age >= 21)
        {
            System.out.println("You get a wristband!");
        }
        else if (age > 0 && age < 21)
        {
            System.out.println("I’m sorry, your age is under 21!");
        }
        else
        {
            System.out.println("That’s not an age!");
        }
    }
}
