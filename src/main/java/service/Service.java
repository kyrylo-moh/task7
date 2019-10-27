package service;

import model.ModelNumber;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private List<Integer> listOfIntegers = new ArrayList<Integer>();

    public List<Integer> getNumber(ModelNumber modelNumber) {
        int i = 0;
        while (Math.pow(i, i) < modelNumber.getNumber()) {
            listOfIntegers.add(i);
            i++;
        }
        return listOfIntegers;
    }
}
