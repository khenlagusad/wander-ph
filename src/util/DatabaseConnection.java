package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Provides a reusable database connection for the application.
 * Ensures only one connection instance is created (singleton).
 *
 * @author Khen
 * @version 1.0
 */
public class DatabaseConnection {
    private static final String URL = ""; // Input value
    private static final String USER = ""; // Input value
    private static final String PASS = ""; // Input value
    private static Connection conn;

    /**
     * Returns a shared database connection.
     * Creates a new connection only if none exists or it is closed.
     *
     * @return A valid Connection object.
     */
    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
