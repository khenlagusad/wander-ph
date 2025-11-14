package model;

import java.sql.Timestamp;

/**
 * Represents a rating given by a user to a tour guide.
 * Contains rating value, optional comment, and the date/time of the rating.
 *
 * @author Khen Lagusad
 * @version 1.0
 */
public class TourGuideRating {
    private String rating_id;
    private String user_id;
    private String guide_id;
    private int rating_value;
    private String comment;
    private Timestamp rating_datetime;

    /**
     * Constructs a new TourGuideRatings object with all fields initialized.
     *
     * @param rating_id       the unique ID of the rating
     * @param user_id         the ID of the user giving the rating
     * @param guide_id        the ID of the tour guide being rated
     * @param rating_value    the rating value (e.g., 1 to 5)
     * @param comment         optional comment about the guide
     * @param rating_datetime the date and time when the rating was given
     */
    public TourGuideRating(String rating_id, String user_id, String guide_id,
                           int rating_value, String comment, Timestamp rating_datetime) {
        this.rating_id = rating_id;
        this.user_id = user_id;
        this.guide_id = guide_id;
        this.rating_value = rating_value;
        this.comment = comment;
        this.rating_datetime = rating_datetime;
    }

    public String getRatingId() {
        return rating_id;
    }

    public String getUserId() {
        return user_id;
    }

    public String getGuideId() {
        return guide_id;
    }

    public int getRatingValue() {
        return rating_value;
    }

    public String getComment() {
        return comment;
    }

    public Timestamp getRatingDatetime() {
        return rating_datetime;
    }
}
