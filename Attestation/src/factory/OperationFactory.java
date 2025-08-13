package factory;

import operation.Division;
import operation.Multiplication;
import operation.Operation;
import operation.Sum;

public class OperationFactory {
    public static Operation getOperation(String op){
        return switch (op.toLowerCase()){
            case "sum" -> new Sum();
            case "mul" -> new Multiplication();
            case "div" -> new Division();
            default -> throw new IllegalArgumentException("Неизвестная операция:"+ op);
        };
    }


}
