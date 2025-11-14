package model;

import java.sql.Timestamp;

/**
 * Represents a financial transaction made by a user.
 * Contains information about the transaction ID, associated booking or event,
 * amount, type of transaction, and the date/time of the transaction.
 *
 * @author Khen Lagusad
 * @version 1.0
 */
public class Transaction {
    private String transaction_id;
    private String user_id;
    private String booking_id;
    private String event_id;
    private double amount;
    private String transaction_type;
    private Timestamp transaction_datetime;

    /**
     * Constructs a new Transaction object with all fields initialized.
     *
     * @param transaction_id       the unique ID of the transaction
     * @param user_id              the ID of the user who made the transaction
     * @param booking_id           the ID of the related booking (can be null if not applicable)
     * @param event_id             the ID of the related event (can be null if not applicable)
     * @param amount               the amount of the transaction
     * @param transaction_type     the type of transaction (e.g., payment, refund)
     * @param transaction_datetime the date and time when the transaction occurred
     */
    public Transaction(String transaction_id, String user_id, String booking_id, String event_id,
                       double amount, String transaction_type, Timestamp transaction_datetime) {
        this.transaction_id = transaction_id;
        this.user_id = user_id;
        this.booking_id = booking_id;
        this.event_id = event_id;
        this.amount = amount;
        this.transaction_type = transaction_type;
        this.transaction_datetime = transaction_datetime;
    }

    public String getTransactionId() {
        return transaction_id;
    }

    public String getUserId() {
        return user_id;
    }

    public String getBookingId() {
        return booking_id;
    }

    public String getEventId() {
        return event_id;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transaction_type;
    }

    public Timestamp getTransactionDatetime() {
        return transaction_datetime;
    }
}
