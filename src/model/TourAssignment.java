package model;

/**
 * Represents the assignment of a tour guide to a specific tour.
 * Contains the IDs of the guide and the tour.
 *
 * @author Khen Lagusad
 * @version 1.0
 */
public class TourAssignment {
    private String guide_id;
    private String tour_id;

    /**
     * Constructs a new TourAssignment object with the given guide and tour IDs.
     *
     * @param guide_id the unique ID of the tour guide
     * @param tour_id  the unique ID of the tour
     */
    public TourAssignment(String guide_id, String tour_id){
        this.guide_id = guide_id;
        this.tour_id = tour_id;
    }

    public String getGuide_id() {
        return guide_id;
    }

    public String getTour_id() {
        return tour_id;
    }

    public void setGuide_id(String guide_id) {
        this.guide_id = guide_id;
    }

    public void setTour_id(String tour_id) {
        this.tour_id = tour_id;
    }
}