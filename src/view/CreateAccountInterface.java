package view;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * This class represents the Create Account interface of the application.
 * It provides text fields for user registration, along with Create and Clear buttons.
 * Layout and style follow the LoginInterface design.
 *
 * Author: Khen Lagusad
 * Version: 1.0
 */
public class CreateAccountInterface extends JFrame {
    private JButton createButton, clearButton;
    private JLabel title;
    private JLabel firstNameLabel, lastNameLabel, usernameLabel, passwordLabel;
    private JLabel phoneLabel, emailLabel, addressLabel, nationalityLabel;
    private JLabel dobLabel, dateCreatedLabel;

    private JTextField firstNameField, lastNameField, usernameField;
    private JPasswordField passwordField;
    private JTextField phoneField, emailField, addressField, nationalityField;
    private JTextField dobField, dateCreatedField;

    /**
     * Constructs the CreateAccountInterface and initializes components.
     */
    public CreateAccountInterface() {
        initComponents();

        setTitle("Create Account");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * Initializes and arranges all GUI components.
     */
    private void initComponents() {
        // Title
        title = new JLabel("Create Account", SwingConstants.CENTER);
        title.setFont(new java.awt.Font("Tahoma", 0, 48));
        title.setForeground(new java.awt.Color(0, 102, 255));
        title.setOpaque(true);

        // Labels
        firstNameLabel = new JLabel("First Name");
        lastNameLabel = new JLabel("Last Name");
        usernameLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");
        phoneLabel = new JLabel("Phone Number");
        emailLabel = new JLabel("Email Address");
        addressLabel = new JLabel("Home Address");
        nationalityLabel = new JLabel("Nationality");
        dobLabel = new JLabel("Date of Birth");
        dateCreatedLabel = new JLabel("Date Created");

        // Fields
        firstNameField = new JTextField();
        lastNameField = new JTextField();
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        phoneField = new JTextField();
        emailField = new JTextField();
        addressField = new JTextField();
        nationalityField = new JTextField();
        dobField = new JTextField();
        dateCreatedField = new JTextField();

        // Buttons
        createButton = new JButton("Create");
        clearButton = new JButton("Clear");

        // Layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(firstNameLabel)
                                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastNameLabel)
                                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameLabel)
                                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordLabel)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneLabel)
                                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailLabel)
                                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addressLabel)
                                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nationalityLabel)
                                        .addComponent(nationalityField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dobLabel)
                                        .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dateCreatedLabel)
                                        .addComponent(dateCreatedField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10)
                                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                )
                                .addGap(50))
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15)
                        .addComponent(firstNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5)
                        .addComponent(lastNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5)
                        .addComponent(usernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5)
                        .addComponent(passwordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5)
                        .addComponent(phoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5)
                        .addComponent(emailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5)
                        .addComponent(addressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5)
                        .addComponent(nationalityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nationalityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5)
                        .addComponent(dobLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5)
                        .addComponent(dateCreatedLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateCreatedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE)
        );

        pack();
    }

    /** Sets action listener for Create and Clear buttons. */
    public void setActionListener(ActionListener e){
        createButton.addActionListener(e);
        clearButton.addActionListener(e);
    }

    // -------------------------
    // Fetch methods
    // -------------------------
    public String fetchFirstName() { return firstNameField.getText(); }
    public String fetchLastName() { return lastNameField.getText(); }
    public String fetchUsername() { return usernameField.getText(); }
    public String fetchPassword() { return new String(passwordField.getPassword()); }
    public String fetchPhone() { return phoneField.getText(); }
    public String fetchEmail() { return emailField.getText(); }
    public String fetchAddress() { return addressField.getText(); }
    public String fetchNationality() { return nationalityField.getText(); }
    public String fetchDOB() { return dobField.getText(); }
    public String fetchDateCreated() { return dateCreatedField.getText(); }

    /** Clears all text fields. */
    public void clearFields() {
        firstNameField.setText(""); lastNameField.setText("");
        usernameField.setText(""); passwordField.setText("");
        phoneField.setText(""); emailField.setText("");
        addressField.setText(""); nationalityField.setText("");
        dobField.setText(""); dateCreatedField.setText("");
    }
}
