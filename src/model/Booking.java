package model;

import java.sql.Timestamp;

/**
 * Represents a booking made by a user for an event.
 * Contains information about the booking ID, user, event, number of participants, booking datetime, and status.
 *
 * @author Khen Lagusad
 * @version 1.0
 */
public class Booking {
    private String booking_id;
    private String user_id;
    private String event_id;
    private Timestamp booking_datetime;
    private int num_participants;
    private String status;

    /**
     * Constructs a new Booking object with all fields initialized.
     *
     * @param booking_id       the unique ID of the booking
     * @param user_id          the ID of the user who made the booking
     * @param event_id         the ID of the event being booked
     * @param booking_datetime the date and time of the booking
     * @param num_participants the number of participants for the booking
     * @param status           the status of the booking (e.g., confirmed, cancelled)
     */
    public Booking(String booking_id, String user_id, String event_id,
                   Timestamp booking_datetime, int num_participants, String status) {
        this.booking_id = booking_id;
        this.user_id = user_id;
        this.event_id = event_id;
        this.booking_datetime = booking_datetime;
        this.num_participants = num_participants;
        this.status = status;
    }

    // Getters for all attributes

    public String getBookingId() {
        return booking_id;
    }

    public String getUserId() {
        return user_id;
    }

    public String getEventId() {
        return event_id;
    }

    public Timestamp getBookingDatetime() {
        return booking_datetime;
    }

    public int getNumParticipants() {
        return num_participants;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
