package operation;

import module.ComplexNumber;

public class Sum implements Operation{


    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImag() + b.getImag());
    }
}
