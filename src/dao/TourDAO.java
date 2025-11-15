package dao;

import model.Tour;
import java.util.List;

/**
 * Data Access Object for Tour operations.
 * Provides methods for retrieving, inserting, deleting,
 * and updating specific fields of a Tour.
 *
 * @author Khen Lagusad
 * @version 1.0
 */
public class TourDAO {

    /**
     * Retrieves a Tour by its ID.
     *
     * @param tour_id The unique ID of the tour.
     * @return A Tour object if found, otherwise null.
     */
    public Tour getTour(String tour_id) {
        // SQL Statement
        return null;
    }

    /**
     * Retrieves all Tours.
     *
     * @return A list of Tour objects.
     */
    public List<Tour> getTours() {
        // SQL Statement
        return null;
    }

    /**
     * Updates an existing Tour's modifiable fields (tour_name, description,
     * price_per_head, city, province, duration, max_capacity, meeting_point).
     *
     * @param tour The Tour object containing updated values.
     */
    public void updateTour(Tour tour) {
        // SQL Statement
    }

    /**
     * Inserts a new Tour record into the database.
     *
     * @param tour The Tour object to insert.
     */
    public void insertTour(Tour tour) {
        // SQL Statement
    }

    /**
     * Deletes a Tour record based on ID.
     *
     * @param tour_id The ID of the tour to delete.
     */
    public void deleteTour(String tour_id) {
        // SQL Statement
    }
}