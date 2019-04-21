package CalculatorClasess;

public class Divider extends CalculatorProcess {
    public String getKeyword() {
        return "divider";
    }

    public char getSymbol() {
        return CalculatorInterface.DIVIDE_SYMBOL;
    }

    public CalculatorProcess selector(String keyword) {
        if(keyword.equalsIgnoreCase("divide")){
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
            result = getLeftVal()/getRightVal();
        }catch (NumberFormatException e){
            throw new CalculatorException("Invalid Number "+ e.getMessage());
        }
        return getResult();
    }
}
