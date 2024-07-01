package service;

import model.ComplexNumber;

public interface Calculable<T extends ComplexNumber> {
    
    T division(T... args) throws Exception;

}
