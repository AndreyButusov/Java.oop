package controller;

import model.ComplexNumber;
import service.DivisionServise;

public class CalculatorController implements ComplexNumberController {
    
    DivisionServise division = new DivisionServise();

    @Override
    public ComplexNumber division (ComplexNumber[] args) {
        ComplexNumber complexNumber = null;
        try {
            complexNumber = division.division(args);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        }
        return complexNumber;
    }
}
