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
     * Updates the first name of a TourGuide.
     *
     * @param guide_id The unique ID of the tour guide.
     * @param first_name The new first name to set.
     */
    public void updateFirstName(String guide_id, String first_name) {
        // SQL Statement
    }

    /**
     * Updates the last name of a TourGuide.
     *
     * @param guide_id The unique ID of the tour guide.
     * @param last_name The new last name to set.
     */
    public void updateLastName(String guide_id, String last_name) {
        // SQL Statement
    }

    /**
     * Updates the phone number of a TourGuide.
     *
     * @param guide_id The unique ID of the tour guide.
     * @param phone_number The new phone number to set.
     */
    public void updatePhoneNumber(String guide_id, String phone_number) {
        // SQL Statement
    }

    /**
     * Updates the email address of a TourGuide.
     *
     * @param guide_id The unique ID of the tour guide.
     * @param email_address The new email address to set.
     */
    public void updateEmailAddress(String guide_id, String email_address) {
        // SQL Statement
    }

    /**
     * Updates the street of a TourGuide.
     *
     * @param guide_id The unique ID of the tour guide.
     * @param street The new street to set.
     */
    public void updateStreet(String guide_id, String street) {
        // SQL Statement
    }

    /**
     * Updates the city of a TourGuide.
     *
     * @param guide_id The unique ID of the tour guide.
     * @param city The new city to set.
     */
    public void updateCity(String guide_id, String city) {
        // SQL Statement
    }

    /**
     * Updates the province of a TourGuide.
     *
     * @param guide_id The unique ID of the tour guide.
     * @param province The new province to set.
     */
    public void updateProvince(String guide_id, String province) {
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