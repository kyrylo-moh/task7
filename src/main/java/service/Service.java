package service;

import model.ModelNumber;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private List<Integer> listOfIntegers = new ArrayList<Integer>();

    public List<Integer> getNumber(ModelNumber modelNumber) {
        int i = 0;
        while ((i * i) < modelNumber.getNumber()) {
            listOfIntegers.add(i);
            i++;
        }
        return listOfIntegers;
    }

    public void clearListOfNumbers() {
        listOfIntegers.clear();
    }
}
