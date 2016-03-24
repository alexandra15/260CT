import java.util.Date;

/**
 *
 * @author user
 */
public class Booking {
    int bookRef;
    String bookingDestination;
    String bookingDeparture;
    Date bookingDate;
    double bookingCost;
    public Booking(int ref, String dest, String dep, Date date, double cost)
    {
        ref = bookRef;
        dest = bookingDestination;
        dep = bookingDeparture;
        date = bookingDate;
        cost = bookingCost;
    }
    public String getDest()
    {
        return bookingDestination;
    }
    public String getDep()
    {
        return bookingDeparture;
    }
    public Date getDate()
    {
        return bookingDate;
    }
    public double getCost()
    {
        return bookingCost;
    }
    
}
