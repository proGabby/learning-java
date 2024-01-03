import java.util.Scanner;

class NumInput {
    public static void main(String[] arg) {
        int age;
        System.out.println("please input your age: ");
        Scanner inputDevice = new Scanner(System.in);
        age = inputDevice.nextInt();
        inputDevice.nextLine(); // This line is needed to clear the enter key
        System.out.println("please enter your birth month: ");
        String birthMonth = inputDevice.nextLine();
        System.out.println(" your age is " + age + ", your birth month is " + birthMonth);
    }
}
