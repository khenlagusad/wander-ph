package dao;

import model.TourRating;
import java.util.List;

/**
 * TourRatingDAO provides CRUD operations for the TourRating entity.
 * It contains methods for inserting, reading, and deleting
 * tour rating records from the database.
 *
 * @author Khen Lagusad
 * @version 1.0
 */
public class TourRatingDAO {

    /**
     * Retrieves a single tour rating from the database by rating ID.
     *
     * @param rating_id the unique ID of the rating
     * @return TourRating object corresponding to the given ID
     */
    public TourRating getTourRating(String rating_id){
        // SQL Statement
        return null;
    }

    /**
     * Retrieves all tour ratings from the database.
     *
     * @return List of all TourRating objects
     */
    public List<TourRating> getTourRatings(){
        // SQL Statement
        return null;
    }

    /**
     * Inserts a new tour rating into the database.
     *
     * @param rating the TourRating object containing rating details
     */
    public void insertTourRating(TourRating rating){
        // SQL Statement
    }

    /**
     * Deletes a tour rating from the database by rating ID.
     *
     * @param rating_id the unique ID of the rating to delete
     */
    public void deleteTourRating(String rating_id){
        // SQL Statement
    }
}