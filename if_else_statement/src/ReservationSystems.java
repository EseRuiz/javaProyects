import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReservationSystems{
    private Set<Integer> reservedSeats;
    private int n;

    public ReservationSystems(int n){
        this.n = n ;
        reservedSeats =  new HashSet<>() ;
    }

    public List<Integer> reserveSeats(int k){
        List<Integer> result = new ArrayList<>();
        int seatNumber;
        for (int i = 0 ; i < k ; i ++){
            seatNumber = fetchSmallestUnreservedSeat();
            if(seatNumber == -1){break ;}
            reserveSeat(seatNumber);
            result.add(seatNumber);
        }
        return result ;
    }

    private int fetchSmallestUnreservedSeat(){
        for(int seat = 1; seat <= n; seat ++){
            if (!reservedSeats.contains(seat)){
                return seat;
            }
        }
        return -1 ;
    }

    public void cancelReservation(int seatNumber){
        reservedSeats.remove(seatNumber) ;
    }

    public Set<Integer> getReservedSeats(){
        return reservedSeats;
    }

    private void reserveSeat(int seatNumber){
        reservedSeats.add(seatNumber);
    }

}