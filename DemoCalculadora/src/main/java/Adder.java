public class Adder extends CalculateBase implements MathProcessing {


    public Adder(){

    }
    public Adder(double leftVal,double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void operate(){
        double result = getLeftVal()+getRightVal();
        setResult(result);
    }

    @Override
    public String getKeyword() {
        return "add";
    }
    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        operate();
        return getResult();
    }
}
