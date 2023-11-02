import java.util.Scanner;
import Model.CarbonFootPrintResponse;
import Model.EmailInfo;

public class Main {

    static String email;
    static int inbox, spam, sent;
    static Server server = new Server();

    public static void main(String[] args) {
        System.out.println("This is the Program for calculating the Email Carbon FootPrint");
        fetchUserInput();
        CarbonFootPrintResponse response = server.fetchResponse(new EmailInfo(email, inbox, spam, sent));
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
        System.out.println("\n\n Your Current Email Carbon Footprint Response is:");
        System.out.println("emailId : " + response.getEmail());
        System.out.println("\nsource : " + response.getDomain());
        System.out.println("\ninbox : " + response.getInboxCarbonFoortPrint() + "g");
        System.out.println("\nsent : " + response.getSentCarbonFoortPrint() + "g");
        System.out.println("\nspam : " + response.getSpamCarbonFoortPrint() + "g");
    }
}