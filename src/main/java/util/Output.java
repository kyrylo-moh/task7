package util;

public class Output {

    void printInstruction() {
        System.out.println("You entered incorrect value. Please try again");
    }

    void printInformation() {
        System.out.println("Please enter value (integer): ");
    }

    public void printNumberSequence(String connector, int number) {
        System.out.print(connector + number);
    }

    public void printQuestion() {
        System.out.println("\nDo you want continue? [Yes/No]");
    }

    void printNotZero() {
        System.out.println("Value must be not less than 0");
    }
}
