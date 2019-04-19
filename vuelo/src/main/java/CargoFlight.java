public class CargoFlight extends Flight {

    private int seats = 12;
    private double alto;
    private double ancho;
    private double peso;


    @Override
    public int getSeats(){
        return seats;
    }

    public void add1Package(double alto,double ancho,double peso){
        this.alto = alto;
        this.ancho = ancho;
        this.peso = peso;
        System.out.println("Packete agregado");
    }
}
