package CalculatorClasess;

public interface CalculatorInterface {

    String separator = " ";
    char ADD_SYMBOL = '+';
    char SUBSTRACT_SYMBOL = '-';
    char MULTIPLY_SYMBOL = '*';
    char DIVIDE_SYMBOL = '/';
    //METHOD
    String getKeyword();
    char getSymbol();
    double doCalculate(String statemnts) throws CalculatorException;
}
