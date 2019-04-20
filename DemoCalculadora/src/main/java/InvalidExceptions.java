public class InvalidExceptions extends Exception {

    public InvalidExceptions(String reason,String statements){
        super(reason + ":" + statements);
    }
    public InvalidExceptions(String reason , String statements,Throwable cause){
        super(reason + ":" + statements,cause);
    }
}
