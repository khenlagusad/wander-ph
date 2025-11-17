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
        titleLabel.setForeground(new Color(0, 102, 204));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(titleLabel, BorderLayout.NORTH);

        // Form Panel with GridBagLayout
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 20, 10, 20);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;

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

        // Add components row by row
        int row = 0;
        gbc.gridx = 0; gbc.gridy = row; formPanel.add(firstNameLabel, gbc);
        gbc.gridx = 1; formPanel.add(firstNameField, gbc);

        row++;
        gbc.gridx = 0; gbc.gridy = row; formPanel.add(lastNameLabel, gbc);
        gbc.gridx = 1; formPanel.add(lastNameField, gbc);

        row++;
        gbc.gridx = 0; gbc.gridy = row; formPanel.add(usernameLabel, gbc);
        gbc.gridx = 1; formPanel.add(usernameField, gbc);

        row++;
        gbc.gridx = 0; gbc.gridy = row; formPanel.add(passwordLabel, gbc);
        gbc.gridx = 1; formPanel.add(passwordField, gbc);

        row++;
        gbc.gridx = 0; gbc.gridy = row; formPanel.add(phoneLabel, gbc);
        gbc.gridx = 1; formPanel.add(phoneField, gbc);

        row++;
        gbc.gridx = 0; gbc.gridy = row; formPanel.add(emailLabel, gbc);
        gbc.gridx = 1; formPanel.add(emailField, gbc);

        row++;
        gbc.gridx = 0; gbc.gridy = row; formPanel.add(addressLabel, gbc);
        gbc.gridx = 1; formPanel.add(addressField, gbc);

        row++;
        gbc.gridx = 0; gbc.gridy = row; formPanel.add(nationalityLabel, gbc);
        gbc.gridx = 1; formPanel.add(nationalityField, gbc);

        row++;
        gbc.gridx = 0; gbc.gridy = row; formPanel.add(dobLabel, gbc);
        gbc.gridx = 1; formPanel.add(dobField, gbc);

        // Scroll pane for form
        JScrollPane scrollPane = new JScrollPane(formPanel);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        add(scrollPane, BorderLayout.CENTER);

        // Save Button at SOUTH
        saveButton = new JButton("Save Changes");
        saveButton.setFont(new Font("Arial", Font.BOLD, 17));
        saveButton.setPreferredSize(new Dimension(180, 40));
        saveButton.setFocusPainted(false); // optional, removes dotted focus border


        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));
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