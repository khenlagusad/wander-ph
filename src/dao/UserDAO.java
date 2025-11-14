package dao;

import model.User;
import java.sql.Date;
import java.util.List;

/**
 * UserDAO provides CRUD operations for the User entity.
 * Methods allow inserting, reading, updating, and deleting users in the database.
 *
 * @author Khen Lagusad
 * @version 1.0
 */
public class UserDAO {
    /**
     * Retrieves a single User from the database by user ID.
     *
     * @param user_id the unique ID of the user
     * @return User object corresponding to the given ID
     */
    public User getUser(String user_id){
        // SQL Statement
    }

    /**
     * Retrieves all users from the database.
     *
     * @return List of all User objects
     */
    public List<User> getUsers(){
        // SQL Statement
    }

    /**
     * Updates the first name of a user.
     *
     * @param userId the unique ID of the user
     * @param firstName the new first name to set
     */
    public static void updateFirstName(String userId, String firstName) {
        // SQL Statement
    }

    /**
     * Updates the last name of a user.
     *
     * @param userId the unique ID of the user
     * @param lastName the new last name to set
     */
    public static void updateLastName(String userId, String lastName) {
        // SQL Statement
    }

    /**
     * Updates the username of a user.
     *
     * @param userId the unique ID of the user
     * @param username the new username to set
     */
    public static void updateUsername(String userId, String username) {
        // SQL Statement
    }

    /**
     * Updates the password of a user.
     *
     * @param userId the unique ID of the user
     * @param password the new password to set
     */
    public static void updatePassword(String userId, String password) {
        // SQL Statement
    }

    /**
     * Updates the phone number of a user.
     *
     * @param userId the unique ID of the user
     * @param phoneNumber the new phone number to set
     */
    public static void updatePhoneNumber(String userId, String phoneNumber) {
        // SQL Statement
    }

    /**
     * Updates the email address of a user.
     *
     * @param userId the unique ID of the user
     * @param emailAddress the new email address to set
     */
    public static void updateEmailAddress(String userId, String emailAddress) {
        // SQL Statement
    }

    /**
     * Updates the home address of a user.
     *
     * @param userId the unique ID of the user
     * @param homeAddress the new home address to set
     */
    public static void updateHomeAddress(String userId, String homeAddress) {
        // SQL Statement
    }

    /**
     * Updates the nationality of a user.
     *
     * @param userId the unique ID of the user
     * @param nationality the new nationality to set
     */
    public static void updateNationality(String userId, String nationality) {
        // SQL Statement
    }

    /**
     * Inserts a new user into the database.
     *
     * @param user_id the unique ID of the user
     * @param first_name the first name of the user
     * @param last_name the last name of the user
     * @param username the username for login
     * @param password the password for login
     * @param phone_number the user's contact number
     * @param email_address the user's email
     * @param home_address the user's home address
     * @param nationality the user's nationality
     * @param date_of_birth the user's date of birth
     * @param date_created the account creation timestamp
     * @param is_admin whether the user has administrative privileges
     */
    public static void insertUser(String user_id, String first_name, String last_name, String username,
                                  String password, String phone_number, String email_address, String home_address,
                                  String nationality, Date date_of_birth, Date date_created, boolean is_admin){
        // SQL Statement
    }

    /**
     * Deletes a user from the database by user ID.
     *
     * @param user_id the unique ID of the user to delete
     */
    public void deleteUser(String user_id){
        // SQL Statement
    }
}