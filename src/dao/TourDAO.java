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
     * Updates the tour name of a Tour.
     *
     * @param tour_id The unique ID of the tour.
     * @param tour_name The new tour name to set.
     */
    public void updateTourName(String tour_id, String tour_name) {
        // SQL Statement
    }

    /**
     * Updates the description of a Tour.
     *
     * @param tour_id The unique ID of the tour.
     * @param description The new description to set.
     */
    public void updateDescription(String tour_id, String description) {
        // SQL Statement
    }

    /**
     * Updates the price per head of a Tour.
     *
     * @param tour_id The unique ID of the tour.
     * @param price_per_head The new price per head to set.
     */
    public void updatePricePerHead(String tour_id, double price_per_head) {
        // SQL Statement
    }

    /**
     * Updates the city of a Tour.
     *
     * @param tour_id The unique ID of the tour.
     * @param city The new city to set.
     */
    public void updateCity(String tour_id, String city) {
        // SQL Statement
    }

    /**
     * Updates the province of a Tour.
     *
     * @param tour_id The unique ID of the tour.
     * @param province The new province to set.
     */
    public void updateProvince(String tour_id, String province) {
        // SQL Statement
    }

    /**
     * Updates the duration of a Tour.
     *
     * @param tour_id The unique ID of the tour.
     * @param duration The new duration to set.
     */
    public void updateDuration(String tour_id, int duration) {
        // SQL Statement
    }

    /**
     * Updates the maximum capacity of a Tour.
     *
     * @param tour_id The unique ID of the tour.
     * @param max_capacity The new maximum capacity to set.
     */
    public void updateMaxCapacity(String tour_id, int max_capacity) {
        // SQL Statement
    }

    /**
     * Updates the meeting point of a Tour.
     *
     * @param tour_id The unique ID of the tour.
     * @param meeting_point The new meeting point to set.
     */
    public void updateMeetingPoint(String tour_id, String meeting_point) {
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