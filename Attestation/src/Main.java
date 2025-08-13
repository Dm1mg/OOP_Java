import factory.OperationFactory;
import logger.AppLogger;
import module.ComplexNumber;
import operation.Operation;
import service.CalculatorService;

import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2, 3);
        ComplexNumber b = new ComplexNumber(1, -4);

        Operation operation = OperationFactory.getOperation("div"); // or "add", "mul"
        CalculatorService calculator = new CalculatorService(operation);

        ComplexNumber result = calculator.calculate(a, b);

    }

}