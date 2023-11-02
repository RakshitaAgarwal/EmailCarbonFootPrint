import java.util.Scanner;
import Model.CarbonFootPrintResponse;
import Model.EmailInfo;

public class Main {

    static String email;
    static int inbox, spam, sent;
    static CarbonFootprintCalculator calculator = new CarbonFootprintCalculator();

    public static void main(String[] args) {
        System.out.println("This is the Program for calculating the Email Carbon FootPrint");
        fetchUserInput();
        CarbonFootPrintResponse response = calculator.fetchResponse(new EmailInfo(email, inbox, spam, sent));
        printResponse(response);
    }

    public static void fetchUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email id:");
        email = sc.nextLine();
        System.out.println("How many emails are there in your inbox?");
        inbox = sc.nextInt();
        System.out.println("How many emails are there in your spam/junk folder?");
        spam = sc.nextInt();
        System.out.println("How many emails are there in your sent folder?");
        sent = sc.nextInt();
        sc.close();
    }

    public static void printResponse(CarbonFootPrintResponse response) {
        System.out.println("\nYour Current Email Carbon Footprint Response is:");
        System.out.println("emailId : " + response.getEmail());
        System.out.println("source : " + response.getDomain());
        System.out.println("inbox : " + response.getInboxCarbonFootPrint() + "g");
        System.out.println("sent : " + response.getSentCarbonFootPrint() + "g");
        System.out.println("spam : " + response.getSpamCarbonFootPrint() + "g");
    }
}