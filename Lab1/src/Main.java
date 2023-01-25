import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many credits have you completed in total for your degree ? ");
        int completednumber = Integer.parseInt( keyboard.nextLine() );
        System.out.println(" You entered " + completednumber + " credits");

        System.out.print( " How many credits in total are required for your degree? ");
        int requiredNumber = Integer.parseInt( keyboard.nextLine() );
        System.out.println(" You entered " + requiredNumber + " credits");

        System.out.println(" How many credits do you take on average per semester? ");
        int average_credits = Integer.parseInt( keyboard.nextLine() );
        System.out.println(" You entered " + average_credits + " credits per semester.");

        System.out.println(" How much is your cost per credit hours ? ");
        int cost_per_credit_hour = Integer.parseInt( keyboard.nextLine() );
        System.out.println(" You entered " + cost_per_credit_hour + " dollars per credit hour.");

        int creditsToGo = (requiredNumber-completednumber);
        Double semestersLeft = Math.ceil((double) creditsToGo/average_credits);
        int cost =  creditsToGo * cost_per_credit_hour;
        System.out.println(" You have " + creditsToGo + " credits left until degree completion."  );
        System.out.println(" It is going to cost you " + cost + " dollars. " );
        System.out.print(" Enjoy your remaining " + semestersLeft + " semesters!");




        // closing the scanner object
        input.close();
    }
}
