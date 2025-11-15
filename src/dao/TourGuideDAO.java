package dao;

import model.TourGuide;
import java.util.List;

/**
 * Data Access Object for TourGuide operations.
 * Provides methods for retrieving, inserting, deleting,
 * and updating specific fields of a TourGuide.
 *
 * @author Khen Lagusad
 * @version 1.0
 */
public class TourGuideDAO {

    /**
     * Retrieves a TourGuide by its ID.
     *
     * @param guide_id The unique ID of the tour guide.
     * @return A TourGuide object if found, otherwise null.
     */
    public TourGuide getTourGuide(String guide_id) {
        // SQL Statement
        return null;
    }

    /**
     * Retrieves all TourGuides.
     *
     * @return A list of TourGuide objects.
     */
    public List<TourGuide> getTourGuides() {
        // SQL Statement
        return null;
    }

    /**
     * Updates an existing TourGuide's modifiable fields (first_name, last_name,
     * phone number, email address, street, city, province).
     *
     * @param guide The TourGuide object containing updated values.
     */
    public void updateTourGuide(TourGuide guide) {
        // SQL Statement
    }

    /**
     * Inserts a new TourGuide record into the database.
     *
     * @param guide The TourGuide object to insert.
     */
    public void insertTourGuide(TourGuide guide) {
        // SQL Statement
    }

    /**
     * Deletes a TourGuide record based on ID.
     *
     * @param guide_id The ID of the tour guide to delete.
     */
    public void deleteTourGuide(String guide_id) {
        // SQL Statement
    }
}