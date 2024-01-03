
import java.util.Scanner;





public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


    //First Take the Input on Principal Amount of Loan Wanted


        System.out.print("Principal Amount of Loan- ");
        int principal = scanner.nextInt();

    //Now we need the Annual Interest Rate:
    //Also we need to divide user input by a 100 to obtain value

        System.out.print("Annual Interest Rate: ");
        float intRate = scanner.nextFloat();
        float intRate1 = intRate/100;

    //To use the formula to calculate interest rate we need the monthly interest rate
    //So we divide the user input by 12 to obtain the desired result
        float monthlyIntRate = intRate1/12;

    //Period of Years User Wants to Take the Loan For:
        System.out.print("How many years do you need to Pay off the Mortgage: ");
        int years = scanner.nextInt();
    //To Calculate the Total Number of Months from User input-
        int months = years*12;


    //Now to Calculate Mortgage

        double numerator = principal*(monthlyIntRate * Math.pow(1 + monthlyIntRate, months)) ;
        double denominator = Math.pow(1 + monthlyIntRate, months) - 1 ;

        double mortgage = Math.round(numerator/denominator);

        System.out.printf("The Calculated Mortgage is: $%.2f." , mortgage);












        }
    }
