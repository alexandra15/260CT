import java.util.Date;

/**
 *
 * @author user
 */
public class BookingList {
    
    private Booking[] bookingList = new Booking[10];
    private static BookingList instance;
    private int bookRef;
    int objname;
    
    
    private static synchronized BookingList getInstance()
    {
        if(instance == null)
            instance = new BookingList();
        return instance;
    }
    public Booking createBooking(String bookingDestination,String bookingDeparture,Date bookingDate, double bookingCost)
    {
        objname++;
        Booking objname = new Booking(bookRef,bookingDestination, bookingDeparture, bookingDate, bookingCost);
        
        bookingList[bookRef] = objname;
        bookRef++;
      
        return objname;
    }
    public String getBookDest(int bookRef)
    {
        return bookingList[bookRef].getDest(); 
    }
    public String getBookDep(int bookRef)
    {
        return bookingList[bookRef].getDep();
    }
    public Date getBookDate(int bookRef)
    {
        return bookingList[bookRef].getDate();
    }
    public double getBookCost(int bookRef)
    {
        return bookingList[bookRef].getCost();
    }
}
