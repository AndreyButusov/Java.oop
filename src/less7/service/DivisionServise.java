package service;

import model.ComplexNumber;

public class DivisionServise implements Calculable {

    @Override
    public ComplexNumber division (ComplexNumber... args) throws Exception {
        
        if ((args[1].getReal()) == 0 && (args[1].getImage()) == 0) {
            throw new ArithmeticException("Деление на ноль");
        }

        ComplexNumber numerator = new ComplexNumber(
            args[0].getReal() * args[1].getReal() - args[0].getImage() * (-args[1].getImage()),
            args[0].getReal() * (-args[1].getImage()) + args[0].getImage() * args[1].getReal());
        ComplexNumber denominator = new ComplexNumber(args[1].getReal() * args[1].getReal(), args[1].getImage()*args[1].getImage());

        return new ComplexNumber(numerator.getReal() / denominator.getReal(), numerator.getImage() / denominator.getReal());
    }

}