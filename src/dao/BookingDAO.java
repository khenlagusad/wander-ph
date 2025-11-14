package dao;

import model.Booking;
import java.util.List;

/**
 * Data Access Object for Booking operations.
 * Provides methods for retrieving, inserting, deleting,
 * and updating the status of a Booking.
 *
 * @author Khen Lagusad
 * @version 1.0
 */
public class BookingDAO {

    /**
     * Retrieves a Booking by its ID.
     *
     * @param booking_id The unique ID of the booking.
     * @return A Booking object if found, otherwise null.
     */
    public Booking getBooking(String booking_id) {
        // SQL Statement
        return null;
    }

    /**
     * Retrieves all Bookings.
     *
     * @return A list of Booking objects.
     */
    public List<Booking> getBookings() {
        // SQL Statement
        return null;
    }

    /**
     * Updates the status of an existing Booking.
     *
     * @param booking_id The unique ID of the booking.
     * @param status The new status to set.
     */
    public void updateStatus(String booking_id, String status) {
        // SQL Statement
    }

    /**
     * Inserts a new Booking record into the database.
     *
     * @param booking The Booking object to insert.
     */
    public void insertBooking(Booking booking) {
        // SQL Statement
    }

    /**
     * Deletes a Booking record.
     *
     * @param booking_id The unique ID of the booking to delete.
     */
    public void deleteBooking(String booking_id) {
        // SQL Statement
    }
}
