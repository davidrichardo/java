public class MathEquation {

    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    public MathEquation(){

    }

    public MathEquation (double leftVal,double rightVal,char opCode){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public MathEquation(char opCode){
        this.opCode = opCode;
    }

    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public char getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public double getResult() {
        return result;
    }


    public void execute(){
            switch (opCode){
                case 'a':
                    result  = leftVal + rightVal;
                    break;
                case 's':
                    result  = leftVal - rightVal;
                    break;
                case 'm':
                    result  = leftVal * rightVal;
                    break;
                case 'd':
                    result = rightVal!=0 ? leftVal / rightVal:0.0;
                    break;

            }
    }
}
