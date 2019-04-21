package CalculatorClasess;

public class Multiplier extends CalculatorProcess {

    public String getKeyword() {
        return "multiply";
    }

    public char getSymbol() {
        return CalculatorInterface.MULTIPLY_SYMBOL;
    }

    public CalculatorProcess selector(String keyword) {
        if(keyword.equalsIgnoreCase("MULTIPLY")){
            return new Divider();
        }else{
            return null;
        }
    }

    public double doCalculate(String statemnts) throws CalculatorException {
        String parts[] = new String[0];

        parts = splitStatement(statemnts);

        try{
            setLeftVal(Double.parseDouble(parts[1])); //1.0
            setRightVal(Double.parseDouble(parts[2])); // 2.0
            result = getLeftVal()*getRightVal();
        }catch (NumberFormatException e){
            throw new CalculatorException("Invalid Number "+ e.getMessage());
        }
        return getResult();
    }
}
