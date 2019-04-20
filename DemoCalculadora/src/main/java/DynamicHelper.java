public class DynamicHelper {

    private MathProcessing handlers[];

    public DynamicHelper(MathProcessing[] handlers){
        this.handlers = handlers;
    }

    public String process(String statements){
        //IN: ADD 1.0 2.0
        //OUT 1.0 + 2.0 = 3.0
        String parts [] = statements.split(MathProcessing.SEPARATOR);
        String keyword = parts[0]; //add

        MathProcessing theHandler = null;

        for(MathProcessing handler:handlers){
            if(keyword.equalsIgnoreCase(handler.getKeyword())){
                theHandler = handler;
            }
        }

        Double leftVal = Double.parseDouble(parts[1]);
        Double rightVal = Double.parseDouble(parts[2]);

        double result = theHandler.doCalculation(leftVal,rightVal);

        StringBuilder math = new StringBuilder(20);

        math.append(leftVal);
        math.append(' ');
        math.append(theHandler.getSymbol());
        math.append(' ');
        math.append(rightVal);
        math.append(' ');
        math.append('=');
        math.append(' ');
        math.append(result);

        return math.toString();

    }

}
