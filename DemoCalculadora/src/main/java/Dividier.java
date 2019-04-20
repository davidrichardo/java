public class Dividier extends CalculateBase  implements MathProcessing{

    public Dividier(){

    }

    public Dividier(double leftVal,double rightVal){
        super(leftVal, rightVal);
    }

    public void operate() {
        double result = getRightVal()!=0 ? getLeftVal()/getRightVal() : 0.0d;
        setResult(result);

    }

    @Override
    public String getKeyword() {
        return "divide";
    }

    @Override
    public char getSymbol() {
        return '/';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        operate();
        return getResult();
    }
}
