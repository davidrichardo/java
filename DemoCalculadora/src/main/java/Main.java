public class Main {

    public static void main(String[] args) {

        String [] statements = new String[]{
//                "add 1.0",
//                "addXX 1.0 2.0",
//                "add xx 1.0",
                "add 1.0 3.0",
                "substract 40.0 25.0",
                "multiply 8 5"
//                "divide 20.0 5"
        };

        DynamicHelper helper = new DynamicHelper(new MathProcessing[]{
                new Adder(),new Multiplier(),new Substracter()
        });

        for(String statement:statements){
            String out = helper.process(statement);
            System.out.println(out);
        }



    }

}
