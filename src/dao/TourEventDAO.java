package dao;

import model.TourEvent;

import java.util.List;

/**
 * Data Access Object for TourEvent operations.
 * Provides methods for retrieving, inserting, deleting,
 * and updating the status of a TourEvent.
 *
 * @author Khen Lagusad
 * @version 1.0
 */
public class TourEventDAO {

    /**
     * Retrieves a TourEvent by its ID.
     *
     * @param event_id The unique ID of the tour event.
     * @return A TourEvent object if found, otherwise null.
     */
    public TourEvent getTourEvent(String event_id) {
        // SQL Statement
        return null;
    }

    /**
     * Retrieves all TourEvents.
     *
     * @return A list of TourEvent objects.
     */
    public List<TourEvent> getTourEvents() {
        // SQL Statement
        return null;
    }

    /**
     * Updates the status of a TourEvent.
     *
     * @param event_id The unique ID of the tour event.
     * @param status The new status to set.
     */
    public void updateStatus(String event_id, String status) {
        // SQL Statement
    }

    /**
     * Inserts a new TourEvent record into the database.
     *
     * @param event The TourEvent object to insert.
     */
    public void insertTourEvent(TourEvent event) {
        // SQL Statement
    }

    /**
     * Deletes a TourEvent record based on ID.
     *
     * @param event_id The ID of the tour event to delete.
     */
    public void deleteTourEvent(String event_id) {
        // SQL Statement
    }
}