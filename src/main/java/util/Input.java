package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);
    private Validator validator = new Validator();
    private Output output = new Output();

    public int getInt() {
        int num;
        output.printInformation();
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
            if (!validator.isPositiveNumber(num)) {
                output.printNotZero();
                scanner.next();
                num = getInt();
            }
        } else {
            output.printInstruction();
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public String getAnswer() {
        return scanner.next();
    }

}
