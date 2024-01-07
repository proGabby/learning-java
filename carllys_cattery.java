import java.util.Scanner;

class CarlysCattering {

    public static void main(String[] arg) {
        eventManager();
    }

    public static void displayCarlyMotto() {
        System.out.println("Carly’s makes the food that makes it a party.");
    }

    public static void displayCarlyMottoWithAsterisks() {
        System.out.println("**************************************************");
        System.out.println("* Carly's makes the food that makes it a party.  *");
        System.out.println("**************************************************");
    }

    public static void eventManager() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println(" \n How many guests are you expecting?  ");
        int guestsCount = inputDevice.nextInt();
        inputDevice.nextLine();
        Double totalPrince = guestsCount * 35.00;
        System.out
                .println("you are expecting " + guestsCount + " guests." + "\n" + "price per guest is 35.00 USD" + "\n"
                        + "Total price is " + totalPrince + "USD");
        if (guestsCount > 50) {
            System.out.println("It is a large event.");
        } else {
            System.out.println("It is a small event.");
        }
    }

}
