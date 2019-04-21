package CalculatorClasess;

public abstract class CalculatorProcess implements CalculatorInterface {

    private double leftVal;
    private double rightVal;
    protected double result;
    private String statement;

    public CalculatorProcess(){

    }

    public CalculatorProcess(String statement){
        this.statement = statement;
    }

    public double getLeftVal() {
        return leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public double getResult() {
        return result;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal=leftVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal=rightVal;
    }

    public abstract String getKeyword() ;

    public abstract char getSymbol();

    public abstract double doCalculate(String statemnts) throws CalculatorException;

    public String[] splitStatement(String statement) throws CalculatorException{
        String[] partsStatement = statement.split(CalculatorInterface.separator);
        if(partsStatement.length!=3){
            throw new CalculatorException("Incomplete Number Statements"+" "+statement);
        }else
            return partsStatement;
  }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(20);
        sb.append(getLeftVal());
        sb.append(CalculatorInterface.separator);
        sb.append(getSymbol());
        sb.append(CalculatorInterface.separator);
        sb.append(getRightVal());
        sb.append(CalculatorInterface.separator);
        sb.append("=");
        sb.append(CalculatorInterface.separator);
        sb.append(getResult());
        return sb.toString();
    }
}
