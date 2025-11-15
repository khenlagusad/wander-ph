package view.user;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ManageProfileInterface extends JPanel {
    private JLabel titleLabel;
    private JLabel firstNameLabel, lastNameLabel, usernameLabel, passwordLabel, phoneLabel,
            emailLabel, addressLabel, nationalityLabel, dobLabel;

    private JTextField firstNameField, lastNameField, usernameField, phoneField,
            emailField, addressField, nationalityField, dobField;

    private JPasswordField passwordField;

    private JButton saveButton;

    public ManageProfileInterface() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        // Title
        titleLabel = new JLabel("Manage Your Profile");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 26));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel, BorderLayout.NORTH);

        // Form Panel with GridBagLayout
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 20, 10, 20);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Labels
        firstNameLabel = new JLabel("First Name:");
        lastNameLabel = new JLabel("Last Name:");
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        phoneLabel = new JLabel("Phone Number:");
        emailLabel = new JLabel("Email Address:");
        addressLabel = new JLabel("Home Address:");
        nationalityLabel = new JLabel("Nationality:");
        dobLabel = new JLabel("Date of Birth:");

        Font labelFont = new Font("Segoe UI", Font.BOLD, 14);
        firstNameLabel.setFont(labelFont); lastNameLabel.setFont(labelFont);
        usernameLabel.setFont(labelFont); passwordLabel.setFont(labelFont);
        phoneLabel.setFont(labelFont); emailLabel.setFont(labelFont);
        addressLabel.setFont(labelFont); nationalityLabel.setFont(labelFont);
        dobLabel.setFont(labelFont);

        // Fields
        firstNameField = new JTextField("Khen");
        lastNameField = new JTextField("Lagusad");
        usernameField = new JTextField("kh3n_lagusad");
        usernameField.setEditable(false);
        passwordField = new JPasswordField("admin123");
        phoneField = new JTextField("+63 9687338385");
        emailField = new JTextField("khen_lagusad@gmail.com");
        addressField = new JTextField("110 M. Hizon St, Caloocan City, Metro Manila");
        nationalityField = new JTextField("Filipino");
        dobField = new JTextField("01/01/2000");
        dobField.setEditable(false);

        // Add components
        gbc.gridx = 0; gbc.gridy = 0; formPanel.add(firstNameLabel, gbc);
        gbc.gridx = 1; formPanel.add(firstNameField, gbc);

        gbc.gridx = 0; gbc.gridy++; formPanel.add(lastNameLabel, gbc);
        gbc.gridx = 1; formPanel.add(lastNameField, gbc);

        gbc.gridx = 0; gbc.gridy++; formPanel.add(usernameLabel, gbc);
        gbc.gridx = 1; formPanel.add(usernameField, gbc);

        gbc.gridx = 0; gbc.gridy++; formPanel.add(passwordLabel, gbc);
        gbc.gridx = 1; formPanel.add(passwordField, gbc);

        gbc.gridx = 0; gbc.gridy++; formPanel.add(phoneLabel, gbc);
        gbc.gridx = 1; formPanel.add(phoneField, gbc);

        gbc.gridx = 0; gbc.gridy++; formPanel.add(emailLabel, gbc);
        gbc.gridx = 1; formPanel.add(emailField, gbc);

        gbc.gridx = 0; gbc.gridy++; formPanel.add(addressLabel, gbc);
        gbc.gridx = 1; formPanel.add(addressField, gbc);

        gbc.gridx = 0; gbc.gridy++; formPanel.add(nationalityLabel, gbc);
        gbc.gridx = 1; formPanel.add(nationalityField, gbc);

        gbc.gridx = 0; gbc.gridy++; formPanel.add(dobLabel, gbc);
        gbc.gridx = 1; formPanel.add(dobField, gbc);

        // Scroll pane for form
        JScrollPane scrollPane = new JScrollPane(formPanel);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        add(scrollPane, BorderLayout.CENTER);

        // Save Button in SOUTH panel (always visible)
        saveButton = new JButton("Save Changes");
        saveButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
        saveButton.setBackground(new Color(30, 144, 255));
        saveButton.setForeground(Color.WHITE);
        saveButton.setFocusPainted(false);
        saveButton.setBorder(BorderFactory.createEmptyBorder(8, 20, 8, 20));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.add(saveButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void setActionListener(ActionListener e) {
        saveButton.addActionListener(e);
    }

    // Getters for controller
    public String fetchFirstName() { return firstNameField.getText(); }
    public String fetchLastName() { return lastNameField.getText(); }
    public String fetchUsername() { return usernameField.getText(); }
    public String fetchPassword() { return new String(passwordField.getPassword()); }
    public String fetchPhone() { return phoneField.getText(); }
    public String fetchEmail() { return emailField.getText(); }
    public String fetchAddress() { return addressField.getText(); }
    public String fetchNationality() { return nationalityField.getText(); }
    public String fetchDateOfBirth() { return dobField.getText(); }
}
