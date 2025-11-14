package dao;

import model.TourGuideRating;
import java.util.List;

/**
 * Data Access Object (DAO) class for handling TourGuideRating database operations.
 * This class defines the basic CRUD methods used to interact with the
 * TourGuide_Rating table in the database.
 *
 * @author Khen Lagusad
 * @version 1.0
 */
public class TourGuideRatingDAO {

    /**
     * Retrieves a single tour guide rating using its rating ID.
     *
     * @param rating_id The ID of the rating to retrieve.
     * @return A TourGuideRating object if found, otherwise null.
     */
    public TourGuideRating getTourGuideRating(String rating_id){
        return null;
    }

    /**
     * Retrieves all tour guide ratings from the database.
     *
     * @return A list of all TourGuideRating records.
     */
    public List<TourGuideRating> getTourGuideRatings(){
        return null;
    }

    /**
     * Inserts a new rating into the TourGuide_Rating table.
     *
     * @param rating The TourGuideRating object to insert.
     */
    public void insertTourGuideRating(TourGuideRating rating){

    }

    /**
     * Deletes a rating from the database using its rating ID.
     *
     * @param rating_id The ID of the rating to delete.
     */
    public void deleteTourGuideRating(String rating_id){

    }
}