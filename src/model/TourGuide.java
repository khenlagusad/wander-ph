package model;

import java.sql.Date;

/**
 * Represents a tour guide in the system.
 * Contains personal details, contact information, and location data.
 *
 * @author Khen Lagusad
 * @version 1.0
 */
public class TourGuide {
    private String guide_id;
    private String first_name;
    private String last_name;
    private String phone_number;
    private String email_address;
    private String street;
    private String city;
    private String province;
    private Date date_of_birth;

    /**
     * Constructs a new TourGuide object with all fields initialized.
     *
     * @param guide_id      the unique ID of the tour guide
     * @param first_name    the first name of the guide
     * @param last_name     the last name of the guide
     * @param phone_number  the contact number of the guide
     * @param email_address the email address of the guide
     * @param street        the street of the guide's address
     * @param city          the city where the guide resides
     * @param province      the province where the guide resides
     * @param date_of_birth the date of birth of the guide
     */
    public TourGuide(String guide_id, String first_name, String last_name, String phone_number,
                     String email_address, String street, String city, String province,
                     Date date_of_birth) {
        this.guide_id = guide_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.email_address = email_address;
        this.street = street;
        this.city = city;
        this.province = province;
        this.date_of_birth = date_of_birth;
    }

    public String getGuideId() {
        return guide_id;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public String getEmailAddress() {
        return email_address;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public Date getDateOfBirth() {
        return date_of_birth;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
