package dao;

import model.User;
import java.util.List;

/**
 * UserDAO provides CRUD operations for the User entity.
 * It contains methods for inserting, reading, updating, and deleting
 * User records from the database.
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
        return null;
    }

    /**
     * Retrieves all users from the database.
     *
     * @return List of all User objects
     */
    public List<User> getUsers(){
        // SQL Statement
        return null;
    }

    /**
     * Updates the first name of a user.
     *
     * @param userId the unique ID of the user
     * @param firstName the new first name to set
     */
    public void updateFirstName(String userId, String firstName) {
        // SQL Statement
    }

    /**
     * Updates the last name of a user.
     *
     * @param userId the unique ID of the user
     * @param lastName the new last name to set
     */
    public void updateLastName(String userId, String lastName) {
        // SQL Statement
    }

    /**
     * Updates the username of a user.
     *
     * @param userId the unique ID of the user
     * @param username the new username to set
     */
    public void updateUsername(String userId, String username) {
        // SQL Statement
    }

    /**
     * Updates the password of a user.
     *
     * @param userId the unique ID of the user
     * @param password the new password to set
     */
    public void updatePassword(String userId, String password) {
        // SQL Statement
    }

    /**
     * Updates the phone number of a user.
     *
     * @param userId the unique ID of the user
     * @param phoneNumber the new phone number to set
     */
    public void updatePhoneNumber(String userId, String phoneNumber) {
        // SQL Statement
    }

    /**
     * Updates the email address of a user.
     *
     * @param userId the unique ID of the user
     * @param emailAddress the new email address to set
     */
    public void updateEmailAddress(String userId, String emailAddress) {
        // SQL Statement
    }

    /**
     * Updates the home address of a user.
     *
     * @param userId the unique ID of the user
     * @param homeAddress the new home address to set
     */
    public void updateHomeAddress(String userId, String homeAddress) {
        // SQL Statement
    }

    /**
     * Updates the nationality of a user.
     *
     * @param userId the unique ID of the user
     * @param nationality the new nationality to set
     */
    public void updateNationality(String userId, String nationality) {
        // SQL Statement
    }

    /**
     * Inserts a new user into the database.
     *
     * @param user the User object containing all user information
     */
    public void insertUser(User user){
        // SQL Statement
    }

    /**
     * Updates an existing user with all modifiable fields.
     *
     * @param user the User object containing updated values
     */
    public void updateUser(User user){
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