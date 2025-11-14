package model;

import java.sql.Date;

/**
 * Represents a user in the system with personal details,
 * login credentials, and administrative status.
 *
 * @author Khen Lagusad
 * @version 1.0
 */
public class User {
    private String user_id;
    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private String phone_number;
    private String email_address;
    private String home_address;
    private String nationality;
    private Date date_of_birth;
    private Date date_created;
    private boolean is_admin;

    /**
     * Constructs a new User object with all fields initialized.
     *
     * @param user_id       the unique ID of the user
     * @param first_name    the first name of the user
     * @param last_name     the last name of the user
     * @param username      the username for login
     * @param password      the password for login
     * @param phone_number  the user's contact number
     * @param home_address  the home address of the user
     * @param nationality   the nationality of the user
     * @param date_of_birth the date of birth of the user
     * @param date_created  the date when the account was created
     * @param is_admin      whether the user has administrative privileges
     */
    public User(String user_id, String first_name, String last_name, String username,
                String password, String phone_number, String email_address, String home_address,
                String nationality, Date date_of_birth, Date date_created, boolean is_admin) {
        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
        this.phone_number = phone_number;
        this.email_address = email_address;
        this.home_address = home_address;
        this.nationality = nationality;
        this.date_of_birth = date_of_birth;
        this.date_created = date_created;
        this.is_admin = is_admin;
    }

    public String getUserId() {
        return user_id;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public String getEmail_address() {
        return email_address;
    }

    public String getHomeAddress() {
        return home_address;
    }

    public String getNationality() {
        return nationality;
    }

    public Date getDateOfBirth() {
        return date_of_birth;
    }

    public Date getDateCreated() {
        return date_created;
    }

    public boolean getIsAdmin() {
        return is_admin;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setEmailAddress(String email_address) {
        this.email_address = email_address;
    }

    public void setHomeAddress(String home_address) {
        this.home_address = home_address;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
