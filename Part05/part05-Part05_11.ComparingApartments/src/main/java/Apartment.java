
import static java.lang.Math.abs;


public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if(compared.squares<this.squares){
            return true;
        }else{
            return false;
        }
    }
    public int priceDifference(Apartment compared){
        return abs(this.price()-compared.price());
        
    }
    private int price(){
        return this.squares*this.pricePerSquare;
    }
    public boolean moreExpensiveThan(Apartment compared){
        return this.price()>compared.price();
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }

    public int getPricePerSquare() {
        return pricePerSquare;
    }
}
