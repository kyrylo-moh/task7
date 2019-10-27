package util;

public class Output {

    public void printInstruction() {
        System.out.println("You entered incorrect value. Please try again");
    }

    public void printInformation() {
        System.out.println("Please enter value (integer): ");
    }

    public void printNumberSequence(String connector, int number) {
        System.out.print(connector + number);
    }

    public void printQuestion() {
        System.out.println("\nDo you want continue? [Yes/No]");
    }

}
