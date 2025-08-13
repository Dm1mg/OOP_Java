package operation;

import module.ComplexNumber;

public class Multiplication implements Operation{

    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() * b.getReal() - a.getImag() * b.getImag();
        double imag = a.getReal() * b.getImag() + a.getImag() * b.getReal();
        return new ComplexNumber(real, imag);
    }
}
