package CalculatorClasess;

public class Adder extends CalculatorProcess {

    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return ADD_SYMBOL;
    }



    @Override
    public double doCalculate(String statements) throws CalculatorException {
            String parts[] = splitStatement(statements);
            String keyword = parts[0]; //add
        try{
            setLeftVal(Double.parseDouble(parts[1])); //1.0
            setRightVal(Double.parseDouble(parts[2])); // 2.0
            result = getLeftVal()+getRightVal();
        }catch (NumberFormatException e){
            throw new CalculatorException("Invalid Number "+ e.getMessage());
        }
        return getResult();

    }


}
