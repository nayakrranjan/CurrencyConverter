import java.util.Scanner;

public class currencyConverter {
    
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Available Options: INR & USD");
        System.out.print("Your Currency: ");
        String YourCurrency = scan.next();
        System.out.println("Convert to [Available Option INR, USD, GBP, EURO]");
        String ConvertTO = scan.next();

        System.out.print(YourCurrency + ": ");
        int amount = scan.nextInt();

        switch(YourCurrency){
            case "INR":
            switch(ConvertTO){
                case "INR":
                 System.out.println("INR: " + amount);
                 break;
                case "USD":
                 System.out.println("USD: " + amount * 0.012f);
                 break;
                case "GBP":
                 System.out.println("GBP: " + amount * 0.011f);
                 break;
                case "EURO":
                 System.out.println("EURO: " + amount * 0.012f);
                 break;
                default:
                 System.out.println("INVALID INPUT");
                 break;
            }
            break;
            case "USD":
            switch(ConvertTO){
                case "INR":
                System.out.println("INR: " + amount * 82);
                break;
                case "USD":
                System.out.println("USD: " + amount);
                break;
                case "GBP":
                System.out.println("GBP: " + amount * 0.9f);
                break;
                case "EURO":
                System.out.println("EURO: " + amount * 1.03f);
                break;
                default:
                System.out.println("INVALID INPUT");
                break;
            }
            break;
            default:
            System.out.println("INVALID INPUT");
            break;
        }
    }
}
