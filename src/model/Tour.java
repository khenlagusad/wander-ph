package model;

/**
 * Represents a tour offered by the system.
 * Contains information such as tour ID, name, description, pricing,
 * location, duration, capacity, and meeting point.
 *
 * @author Khen Lagusad
 * @version 1.0
 */
public class Tour {
    private String tour_id;
    private String tour_name;
    private String description;
    private double price_per_head;
    private String city;
    private String province;
    private int duration;
    private int max_capacity;
    private String meeting_point;

    /**
     * Constructs a new Tour object with all fields initialized.
     *
     * @param tour_id        the unique ID of the tour
     * @param tour_name      the name of the tour
     * @param description    the description of the tour
     * @param price_per_head the price per person
     * @param city           the city where the tour takes place
     * @param province       the province where the tour takes place
     * @param duration       the duration of the tour in hours/days
     * @param max_capacity   the maximum number of participants
     * @param meeting_point  the meeting location for the tour
     */
    public Tour(String tour_id, String tour_name, String description, double price_per_head,
                String city, String province, int duration, int max_capacity, String meeting_point) {
        this.tour_id = tour_id;
        this.tour_name = tour_name;
        this.description = description;
        this.price_per_head = price_per_head;
        this.city = city;
        this.province = province;
        this.duration = duration;
        this.max_capacity = max_capacity;
        this.meeting_point = meeting_point;
    }

    public String getTourId() {
        return tour_id;
    }

    public String getTourName() {
        return tour_name;
    }

    public String getDescription() {
        return description;
    }

    public double getPricePerHead() {
        return price_per_head;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public int getDuration() {
        return duration;
    }

    public int getMaxCapacity() {
        return max_capacity;
    }

    public String getMeetingPoint() {
        return meeting_point;
    }

    public void setTour_name(String tour_name) {
        this.tour_name = tour_name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice_per_head(double price_per_head) {
        this.price_per_head = price_per_head;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setMax_capacity(int max_capacity) {
        this.max_capacity = max_capacity;
    }

    public void setMeetingPoint(String meeting_point) {
        this.meeting_point = meeting_point;
    }
}
