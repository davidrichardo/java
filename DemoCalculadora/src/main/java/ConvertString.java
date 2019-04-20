public class ConvertString {

    private static final char ADD_SIMBOL='+';
    private static final char SUBSTRACT_SIMBOL='-';
    private static final char MULTIPLY_SIMBOL='*';
    private static final char DIVIDE_SIMBOL='/';

    private double leftVal;
    private double rightVal;
    private double result;

    public String getStatements() {
        return statements;
    }

    public void setStatements(String statements) {
        this.statements = statements;
    }

    private String statements;
    private EnumCalculator operator;

    public ConvertString(){

    }


    public ConvertString(String statements){
        this.statements = statements;
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

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void identificateParts(String statements) throws InvalidExceptions {

        //IN add 1.0 2.0
        String parts[] = statements.split(" ");

        if(parts.length!=3){
            throw new InvalidExceptions("Invalid parts for operations",statements);
        }

        String opCode = parts[0]; //add



        try {
            leftVal = Double.parseDouble(parts[1]);//1.0
            rightVal = Double.parseDouble(parts[2]);//2.0
        }catch (NumberFormatException e){
            throw new InvalidExceptions("Data is not numeric",statements,e);
        }

        setOperatorFromString(parts[0]);


        }

    private void setOperatorFromString(String setOperator) throws InvalidExceptions {

        if(setOperator.equalsIgnoreCase(operator.ADD.toString())){
            operator = EnumCalculator.ADD;
        }else if(setOperator.equalsIgnoreCase(operator.SUBSTRACT.toString())){
            operator = EnumCalculator.SUBSTRACT;
        }else if(setOperator.equalsIgnoreCase(operator.MULTIPLY.toString())) {
            operator = EnumCalculator.MULTIPLY;
        }else if(setOperator.equalsIgnoreCase(operator.DIVIDE.toString())) {
            operator = EnumCalculator.DIVIDE;
        }

        if(operator==null){
            throw new InvalidExceptions("Invalid Operator",setOperator);
        }else{
            setOperationFromString(operator);
        }



    }

    private void setOperationFromString(EnumCalculator enumCalculator)  {

        CalculateBase calculateBase = null;

        switch (enumCalculator){
            case ADD:
                calculateBase =new Adder(leftVal, rightVal);

                break;
            case SUBSTRACT:
                calculateBase = new Substracter(leftVal, rightVal);

                break;
            case MULTIPLY:
                calculateBase = new Multiplier(leftVal,rightVal);

                break;
            case DIVIDE:
                calculateBase = new Dividier(leftVal, rightVal);

                break;
        }

        calculateBase.operate();
        result = calculateBase.getResult();
    }

    @Override
    public String toString(){

        StringBuilder math = new StringBuilder(20);

        math.append(getLeftVal());

        math.append(' ');

        switch(operator) {
            case ADD:
                math.append(ADD_SIMBOL);
                break;
            case SUBSTRACT:
                math.append(SUBSTRACT_SIMBOL);
                break;
            case MULTIPLY:
                math.append(MULTIPLY_SIMBOL);
                break;
            case DIVIDE:
                math.append(DIVIDE_SIMBOL);
                break;

        }
        math.append(' ');
        math.append(getRightVal());
        math.append(' ');
        math.append('=');
        math.append(' ');
        math.append(getResult());




        return math.toString();
    }

}
