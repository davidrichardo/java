public class Main {

    public static void main(String[] args) {


        MathEquation equations[] = new MathEquation[4];
        equations[0] = new MathEquation(23.0,12.0,'a');
        equations[1] =  new MathEquation(23.0,12.0,'s');
        equations[2] =  new MathEquation(2.0,7.0,'m');
        equations[3] =  new MathEquation(24.0,12.0,'d');


        for(MathEquation result:equations){
            result.execute();
            System.out.println("the result is: " +result.getResult());
        }

        CalculateBase c [] = new CalculateBase[]{
          new Adder(2,5),new Adder(20,50),new Substracter(12,7)
        };

        for(CalculateBase cs:c){
            cs.operate();
        }


    }

}
