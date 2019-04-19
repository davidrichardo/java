public class Passenger {

    private int checkedBags;

    private int freeBags;

    private double perBagFee;

    public int getCheckedBags() {
        return checkedBags;
    }

    public void setCheckedBags(int checkedBags) {
        this.checkedBags = checkedBags;
    }

    public int getFreeBags() {
        return freeBags;
    }

    public void setFreeBags(int freeBags) {
        this.freeBags = freeBags;
    }

    public double getPerBagFee() {
        return perBagFee;
    }

    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }

    public Passenger(int checkedBags,int freeBags){
        this(freeBags);
        this.checkedBags = checkedBags;
    }

    public Passenger(int freeBags) {
        this( freeBags > 1 ? 25.0d : 50.0d );
        this.freeBags=freeBags;
    }

    private Passenger(double perBagFee){
        this.perBagFee = perBagFee;
    }

    public Passenger(){

    }
}
