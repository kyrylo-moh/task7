package controller;

import model.ModelNumber;
import service.Service;
import util.Input;
import util.Output;

public class Controller {

    private Output output = new Output();
    private Input input = new Input();
    private Service service = new Service();

    private void numberSequence() {
        String connectStr = " ";
        ModelNumber modelNumber = new ModelNumber(input.getInt());
        for (int number : service.getNumber(modelNumber)) {
            output.printNumberSequence(connectStr, number);
            connectStr = ", ";
        }
        service.clearListOfNumbers();
    }

    public void runController() {
        String answer;
        do {
            numberSequence();
            output.printQuestion();
            answer = input.getAnswer();
        } while (answer.equalsIgnoreCase("y") ||
                answer.equalsIgnoreCase("yes"));
    }

}
