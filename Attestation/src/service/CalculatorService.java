package service;

import logger.AppLogger;
import module.ComplexNumber;
import operation.Operation;

import java.util.logging.Logger;

public class CalculatorService {
    private static final Logger logger = AppLogger.getLogger();

    private final Operation operation;

    public CalculatorService(Operation operation) {
        this.operation = operation;
    }


    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        logger.info("Вычисляется число " + a + " и число  " + b + " операция: " + operation.getClass().getSimpleName());
        ComplexNumber result = operation.execute(a, b);
        logger.info("Результат: " + result);
        return result;
    }
}
