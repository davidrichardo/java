package CalculatorClasess;

public class Substracter extends CalculatorProcess {

    public String getKeyword() {
        return "substracter";
    }

    public char getSymbol() {
        return CalculatorInterface.SUBSTRACT_SYMBOL;
    }

    public CalculatorProcess selector(String keyword) {
        if(keyword.equalsIgnoreCase("substract")){
            return new Divider();
        }else{
            return null;
        }
    }

    public double doCalculate(String statemnts) throws CalculatorException,NumberFormatException {

        String parts[] = new String[0];
        parts = splitStatement(statemnts);
        try{
            setLeftVal(Double.parseDouble(parts[1])); //1.0
            setRightVal(Double.parseDouble(parts[2])); // 2.0
            result = getLeftVal()-getRightVal();
        }catch (NumberFormatException e){
            throw new CalculatorException("Invalid Number "+ e.getMessage());
        }
        return getResult();

    }
}
