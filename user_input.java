import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        String name;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("please enter your name : ");
        name = inputDevice.nextLine();
        System.out.println("your name is " + name);
    }
}
