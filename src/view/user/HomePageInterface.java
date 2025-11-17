package view.user;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class HomePageInterface extends JPanel {

    private JLabel helloLabel;
    private JLabel balanceLabel;
    private JLabel backgroundLabel;

    private JTextField topupField;
    private JButton topupButton;
    private JButton clearButton;

    public HomePageInterface() {
        setLayout(null); // manual placement for collage

        // =========================
        // Greeting Labels
        // =========================
        helloLabel = new JLabel("Hello, User!");
        helloLabel.setFont(new Font("Arial", Font.BOLD, 24));
        helloLabel.setBounds(50, 30, 400, 30);
        add(helloLabel);

        balanceLabel = new JLabel("Account Balance: ₱0.00");
        balanceLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        balanceLabel.setBounds(50, 70, 400, 25);
        add(balanceLabel);

        // =========================
        // TOP UP FIELD
        // =========================
        topupField = new JTextField();
        topupField.setFont(new Font("Arial", Font.PLAIN, 16));
        topupField.setBounds(605, 40, 140, 25);
        allowOnlyNumbers(topupField);
        add(topupField);

        // =========================
        // BUTTON PANEL (Top Up + Clear)
        // =========================
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 0, 0));
        buttonPanel.setBounds(600, 75, 150, 25);

        topupButton = new JButton("Top Up");
        topupButton.setFont(new Font("Arial", Font.BOLD, 12));

        clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Arial", Font.BOLD, 12));

        buttonPanel.add(topupButton);
        buttonPanel.add(clearButton);

        add(buttonPanel);

        // =========================
        // Background placeholder
        // =========================
        backgroundLabel = new JLabel("BACKGROUND IMAGE HERE");
        backgroundLabel.setHorizontalAlignment(SwingConstants.CENTER);
        backgroundLabel.setBounds(0, 120, 900, 400);
        add(backgroundLabel);
    }

    // =========================
    // BLOCK NON-NUMERIC INPUT
    // =========================
    private void allowOnlyNumbers(JTextField field) {
        ((AbstractDocument) field.getDocument()).setDocumentFilter(new DocumentFilter() {

            @Override
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr)
                    throws BadLocationException {
                if (text.matches("[0-9.]+")) {
                    super.insertString(fb, offset, text, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                if (text.matches("[0-9.]+")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
    }

    // =========================
    // GETTERS / FETCH METHODS
    // =========================
    public String fetchTopUpAmount() {
        return topupField.getText().trim();
    }

    public void clearTopUpField() {
        topupField.setText("");
    }

    public void setActionListener(ActionListener listener){
        topupButton.addActionListener(listener);
        clearButton.addActionListener(listener);
    }

    // =========================
    // Update Labels
    // =========================
    public void setUsername(String name) {
        helloLabel.setText("Hello, " + name + "!");
    }

    public void setBalance(String balance) {
        balanceLabel.setText("Account Balance: ₱" + balance);
    }
}
