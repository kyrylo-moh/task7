package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public int getNumber() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public String getAnswer() {
        return scanner.next();
    }

}
