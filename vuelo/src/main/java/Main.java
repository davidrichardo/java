import javax.print.attribute.standard.MediaSizeName;

public class Main {
    public static void main(String[] args) {
        Flight f1 = new Flight(140);
        Flight f2 = new Flight(140);
        Passenger p = new Passenger();

        if(f1 == f2){

        }

        if(f1.equals(p)){
            System.out.println("Soy verdadero");
        }

    }
}
