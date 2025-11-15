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
     * Updates the TourAssignment's modifiable fields (tour_id, guide_id).
     *
     * @param assignment the TourAssignment object to be updated.
     */
    public void updateTourAssignment(TourAssignment assignment) {
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
