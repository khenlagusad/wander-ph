package view;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * This class represents the login interface of the application.
 * It provides text fields for username and password input,
 * a login button, and layout management using GroupLayout.
 *
 * @author Khen Lagusad
 * @version 1.0
 */
public class LoginInterface extends JFrame{
    private JButton loginButton;
    private JLabel title;
    private JTextField usernameField;
    private JPasswordField passwordField;

    /**
     * Constructs the login interface and initializes its components.
     */
    public LoginInterface(){
        initComponents();

        setTitle("Login");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * Initializes and arranges GUI components on the frame.
     */
    private void initComponents() {
        loginButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();

        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginButton.setBackground(new java.awt.Color(153, 153, 153));
        loginButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        title.setBackground(new java.awt.Color(204, 204, 204));
        title.setFont(new java.awt.Font("Tahoma", 0, 54)); // NOI18N
        title.setForeground(new java.awt.Color(0, 102, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Login");
        title.setOpaque(true);

        usernameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(passwordField))))
                                .addContainerGap(47, Short.MAX_VALUE))
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }

    /**
     * Sets the ActionListener for the login button.
     *
     * @param e the ActionListener to be added
     */
    public void setActionListener(ActionListener e){
        loginButton.addActionListener(e);
    }

    /**
     * Fetches the text entered in the username field.
     *
     * @return the username as a String
     */
    public String fetchUsernameField(){
        return usernameField.getText();
    }

    /**
     * Fetches the text entered in the password field.
     *
     * @return the password as a String
     */
    public String fetchPasswordField() {
        char[] passwordChars = passwordField.getPassword();
        return new String(passwordChars);
    }

    /**
     * Clears the text fields for username and password.
     */
    public void clearTextfields(){
        usernameField.setText("");
        passwordField.setText("");
    }
}
