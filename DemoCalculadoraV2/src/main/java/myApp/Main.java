package myApp;

import CalculatorClasess.*;

public class Main {


    public static void main(String[] args) {
        //IN: add 1.0 2.0 || substract 20.0 5.0
        //OUT 1.0 + 2.0 = 3.0 || 20.0 - 5.0 = 15.0
        String statements [] = new String []{
          "add 1.0 2.0","substract 25.0 3.0","divide 20.0 5.0","multiply 8.0 5.0","add 1.0","add xx 2.0","divide 5 0","odd 1.0 2.0"
        };


            for(String statement:statements){
                try {
                    CalculatorProcess procces = opCodeSelector(statement);
                    procces.doCalculate(statement);
                    System.out.println(procces.toString());

                }catch (CalculatorException e){
                    System.out.println(e.getMessage());
                }

            }

    }

    public static CalculatorProcess opCodeSelector(String statemnt) throws CalculatorException {

        CalculatorProcess procces = null;

        String parts[] = statemnt.split(" ");

        if (parts[0].equalsIgnoreCase(MathOperations.ADD.toString())) {
            procces = new Adder();

        } else if (parts[0].equalsIgnoreCase(MathOperations.SUBSTRACT.toString())) {
            procces = new Substracter();

        } else if (parts[0].equalsIgnoreCase(MathOperations.MULTIPLY.toString())) {
            procces = new Multiplier();

        } else if (parts[0].equalsIgnoreCase(MathOperations.DIVIDE.toString())) {
            procces = new Divider();

        }else{
            throw new CalculatorException("Invalid Operator: "+parts[0]);
        }

        return procces;
    }


}
