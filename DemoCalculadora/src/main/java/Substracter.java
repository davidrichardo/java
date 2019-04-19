public class Substracter extends CalculateBase {

    public Substracter(){

    }

    public Substracter(double leftVal,double rightVal){
        super(leftVal, rightVal);
    }
    @Override
    public void operate() {
        double result = getLeftVal()-getRightVal();
        setResult(result);
        System.out.println("Substract is "+ getResult());
    }
}
