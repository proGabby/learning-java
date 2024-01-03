import java.util.Scanner;

import javax.swing.JOptionPane;

class NumInput {
    public static void main(String[] arg) {
        getAgeAndNameViaDialog();
    }

    public static void getAgeInputViaCLI() {
        int age;
        System.out.println("please input your age: ");
        Scanner inputDevice = new Scanner(System.in);
        age = inputDevice.nextInt();
        inputDevice.nextLine(); // This line is needed to clear the enter key
        System.out.println("please enter your birth month: ");
        String birthMonth = inputDevice.nextLine();
        System.out.println(" your age is " + age + ", your birth month is " + birthMonth);
    }

    public static void getAgeAndNameViaDialog() {
        int age;
        String name;
        final String ageString = JOptionPane.showInputDialog(null, "Enter your age", "Age Dialog",
                JOptionPane.INFORMATION_MESSAGE);
        age = Integer.parseInt(ageString);
        name = JOptionPane.showInputDialog(null, "Enter your fullName");

        JOptionPane.showMessageDialog(null, "Hello " + name + ". You're " + age + " years old");
    }
}
