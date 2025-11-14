package model;

import java.sql.Date;
import java.sql.Time;

/**
 * Represents an event for a specific tour conducted by a tour guide.
 * Contains information about the event date, start time, and status.
 *
 * @author Khen Lagusad
 * @version 1.0
 */
public class TourEvent {
    private String event_id;
    private String tour_id;
    private String guide_id;
    private Date event_date;
    private Time start_time;
    private String status;

    /**
     * Constructs a new TourEvent object with all fields initialized.
     *
     * @param event_id   the unique ID of the event
     * @param tour_id    the ID of the tour associated with this event
     * @param guide_id   the ID of the guide conducting the tour
     * @param event_date the date of the event
     * @param start_time the start time of the event
     * @param status     the status of the event (e.g., scheduled, completed, cancelled)
     */
    public TourEvent(String event_id, String tour_id, String guide_id, Date event_date,
                     Time start_time, String status) {
        this.event_id = event_id;
        this.tour_id = tour_id;
        this.guide_id = guide_id;
        this.event_date = event_date;
        this.start_time = start_time;
        this.status = status;
    }

    public String getEventId() {
        return event_id;
    }

    public String getTourId() {
        return tour_id;
    }

    public String getGuideId() {
        return guide_id;
    }

    public Date getEventDate() {
        return event_date;
    }

    public Time getStartTime() {
        return start_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
