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
        String sql = "SELECT * from users WHERE user_id=  ? ";
        return null;
    }

    /**
     * Retrieves all users from the database.
     *
     * @return List of all User objects
     */
    public List<User> getUsers(){
        String sql = "SELECT * from users ORDER BY user_id asc";
        return null;
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
     * Updates an existing User's modifiable fields (first_name, last_name,
     * username, password, phone number, email address, home address, nationality).
     *
     * @param user the User object containing updated values.
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