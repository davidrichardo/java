package CalculatorClasess;

public class CalculatorException extends Exception {
    public CalculatorException(){};
    public CalculatorException(String reason){
        super(reason);
    }
    public CalculatorException(String reason,Throwable cause){
        super(reason,cause);
    }

}
