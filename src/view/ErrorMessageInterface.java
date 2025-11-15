package view;

import javax.swing.*;

/**
 * This class represents a custom interface for displaying error messages.
 * It extends JOptionPane and provides a convenience method for showing error dialogs.
 *
 * @author Khen Lagusad
 * @version 1.0
 */
public class ErrorMessageInterface extends JOptionPane {

    /**
     * Displays an error message dialog with the given message.
     *
     * @param message the error message to display
     */
    public static void showError(String message) {
        JOptionPane.showMessageDialog(
                null,               // parent component (null centers on screen)
                message,            // message to display
                "Error",            // dialog title
                JOptionPane.ERROR_MESSAGE  // message type
        );
    }
}
