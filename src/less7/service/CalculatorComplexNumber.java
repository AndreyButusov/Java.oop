package service;

import controller.CalculatorController;
import model.ComplexNumber;
import view.ConsoleLogger;
import view.Loggable;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculatorComplexNumber {

    private final static Map<String, Calculable> operations = new HashMap<>();
    private static CalculatorController controller = new CalculatorController();
    private static Loggable logger = new ConsoleLogger();

    static {
        operations.put("+", args -> new ComplexNumber(args[0].getReal() + args[1].getReal(),
                args[0].getImage() + args[1].getImage()));
        operations.put("-", args -> new ComplexNumber(args[0].getReal() - args[1].getReal(),
                args[0].getImage() - args[1].getImage()));
        operations.put("*", args -> new ComplexNumber(
                args[0].getReal() * args[1].getReal() - args[0].getImage() * args[1].getImage(),
                args[0].getImage() * args[1].getReal() + args[0].getReal() * args[1].getImage()));
        operations.put("/", args -> controller.division(args));

    }

    public ComplexNumber calculate() throws Exception {
        double real1 = Double.parseDouble(prompt("Введите вещественную часть первого числа: "));
        double image1 = Double.parseDouble(prompt("Введите мнимую часть первого числа: "));
        ComplexNumber complexNumber1 = new ComplexNumber(real1, image1);
        String operator = prompt("Введите нужное действие с комплексными числами (+ / - *): ");
        double real2 = Double.parseDouble(prompt("Введите вещественную часть второго числа: "));
        double image2 = Double.parseDouble(prompt("Введите мнимую часть второго числа: "));
        ComplexNumber complexNumber2 = new ComplexNumber(real2, image2);

        if (operations.containsKey(operator)) {
            logger.log(String.format("(%s) %s (%s)", complexNumber1, operator, complexNumber2));
            return operations.get(operator).division(complexNumber1, complexNumber2);
        } else {
            throw new RuntimeException("Данная операция не реализована, выберите одну из предложенных");
        }
    }

    private static String prompt(String record) {
        System.out.println(record);
        return new Scanner(System.in).next();
    }

    public void Start() {
        try {
            System.out.println(calculate());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
