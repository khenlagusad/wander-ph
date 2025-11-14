package dao;

import model.TourAssignment;
import java.util.List;

/**
 * Data Access Object for TourAssignment operations.
 * Provides methods for retrieving, inserting, deleting,
 * and updating guide-tour assignments.
 *
 * @author Khen Lagusad
 * @version 1.0
 */
public class TourAssignmentDAO {

    /**
     * Retrieves a TourAssignment by guide ID and tour ID.
     *
     * @param guide_id The unique ID of the tour guide.
     * @param tour_id The unique ID of the tour.
     * @return A TourAssignment object if found, otherwise null.
     */
    public TourAssignment getTourAssignment(String guide_id, String tour_id) {
        // SQL Statement
        return null;
    }

    /**
     * Retrieves all TourAssignments.
     *
     * @return A list of TourAssignment objects.
     */
    public List<TourAssignment> getTourAssignments() {
        // SQL Statement
        return null;
    }

    /**
     * Updates the guide ID of a TourAssignment.
     *
     * @param tour_id The unique ID of the tour.
     * @param guide_id The new guide ID to set.
     */
    public void updateGuideId(String tour_id, String guide_id) {
        // SQL Statement
    }

    /**
     * Updates the tour ID of a TourAssignment.
     *
     * @param guide_id The unique ID of the guide.
     * @param tour_id The new tour ID to set.
     */
    public void updateTourId(String guide_id, String tour_id) {
        // SQL Statement
    }

    /**
     * Inserts a new TourAssignment record into the database.
     *
     * @param assignment The TourAssignment object to insert.
     */
    public void insertTourAssignment(TourAssignment assignment) {
        // SQL Statement
    }

    /**
     * Deletes a TourAssignment record.
     *
     * @param guide_id The unique ID of the tour guide.
     * @param tour_id The unique ID of the tour.
     */
    public void deleteTourAssignment(String guide_id, String tour_id) {
        // SQL Statement
    }
}
