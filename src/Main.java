import java.util.Scanner; //importing Scanner
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, welcome to the theater, please enter your age:"); //Asking user for their age
        int age = in.nextInt(); //defining variable age
        if (age >= 21) //if/then statement to detect what age user inputted
        {
            System.out.println("You get a wristband!"); //telling user they got a wristband
        }
        else if (age > 0 && age < 21) //if user inputted number below 21
        {
            System.out.println("I’m sorry, your age is under 21!"); //telling user the age they inputted is under 21
        }
        else
        {
            System.out.println("That’s not an age!"); //tells user that the age they inputted is not a real age
        }
    }
}
