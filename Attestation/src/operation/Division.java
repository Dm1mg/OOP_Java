package operation;

import module.ComplexNumber;

public class Division implements Operation{

    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        double denominator = b.getReal() * b.getReal() + b.getImag() * b.getImag();
        if (denominator == 0) {
            throw new ArithmeticException("Знаменатиль не может быть равен 0");
        }
        double real = (a.getReal() * b.getReal() + a.getImag() * b.getImag()) / denominator;
        double imag = (a.getImag() * b.getReal() - a.getReal() * b.getImag()) / denominator;
        return new ComplexNumber(real, imag);
    }
}
