public class Flight {

    private int passengers;
    private int seats = 150;
    private int flightNumber;
    private char flightClass;

    public Flight(){

    }

    public Flight(int flightNumber){
        this.flightNumber=flightNumber;
    }

    public int getSeats(){
        return seats;
    }

    @Override
    public boolean equals(Object o){

        if(o instanceof Flight)
        {
        Flight other = (Flight) o;
        return
        this.flightNumber == other.flightNumber && this.flightClass == other.flightClass;
        }else{
            return false;
        }
    }

    public void setSeats(int seats){
        this.seats = seats;
    }

    public void add1Passenger() {
        if (passengers < seats) {
            passengers += 1;
            System.out.println(passengers);
        } else {
            handletooMany();
        }
    }

    private void handletooMany (){
        System.out.println("There are too many pasenger");
    }

}
