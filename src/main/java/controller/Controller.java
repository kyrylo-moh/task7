package controller;

import model.ModelNumber;
import service.Service;
import util.Input;
import util.Output;
import util.Validator;

import java.util.Scanner;

public class Controller {

    private Output output = new Output();
    private Input input = new Input();
    private Validator validator = new Validator();
    private Service service = new Service();

    private int getNum() {
        output.printInformation();
        int num = input.getNumber();
        while (!validator.isPositiveNumber(num)){
            output.printInstruction();
            num = new Input().getNumber();
        }
        return num;
    }

    private void numberSequence() {
        String connectStr = " ";
        ModelNumber modelNumber = new ModelNumber(getNum());
        for (int number : service.getNumber(modelNumber)) {
            output.printNumberSequence(connectStr, number);
            connectStr = ", ";
        }
        service.clearListOfNumbers();
    }

    public void runController() {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            numberSequence();
            output.printQuestion();
            answer = scanner.nextLine();
        } while (answer.equalsIgnoreCase("y") ||
                answer.equalsIgnoreCase("yes"));
    }

}
