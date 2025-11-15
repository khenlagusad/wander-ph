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
    private JButton createAccountButton;
    private JButton forgotPasswordButton;
    private JLabel title;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
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
        createAccountButton = new JButton();
        forgotPasswordButton = new JButton();
        title = new javax.swing.JLabel();
        usernameLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();

        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginButton.setBackground(new java.awt.Color(153, 153, 153));
        loginButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 0, 0));
        loginButton.setText("Login");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        createAccountButton.setBackground(new java.awt.Color(153, 153, 153));
        createAccountButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createAccountButton.setForeground(new java.awt.Color(0, 0, 0));
        createAccountButton.setText("Create Account");
        createAccountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        forgotPasswordButton.setBackground(new java.awt.Color(153, 153, 153));
        forgotPasswordButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        forgotPasswordButton.setForeground(new java.awt.Color(0, 0, 0));
        forgotPasswordButton.setText("Forgot Password");
        forgotPasswordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        title.setBackground(new java.awt.Color(204, 204, 204));
        title.setFont(new java.awt.Font("Tahoma", 0, 54)); // NOI18N
        title.setForeground(new java.awt.Color(0, 102, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Login");
        title.setOpaque(true);

        usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 14));
        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 14));

        usernameField.setFont(new java.awt.Font("Tahoma", 0, 17));
        passwordField.setFont(new java.awt.Font("Tahoma", 0, 17));

        usernameField.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(usernameLabel)
                                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordLabel)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10)
                                                .addComponent(forgotPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(50))
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20)
                                .addComponent(usernameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15)
                                .addComponent(passwordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(forgotPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        createAccountButton.addActionListener(e);
        forgotPasswordButton.addActionListener(e);
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
