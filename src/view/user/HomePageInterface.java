package view.user;

import javax.swing.*;
import java.awt.*;

public class HomePageInterface extends JPanel {
    private JLabel helloLabel;
    private JLabel balanceLabel;
    private JLabel backgroundLabel;

    public HomePageInterface() {
        setLayout(null); // optional, but gives you full control for the collage later

        helloLabel = new JLabel("Hello, User!");
        helloLabel.setFont(new Font("Arial", Font.BOLD, 24));
        helloLabel.setBounds(50, 30, 400, 30);
        add(helloLabel);

        balanceLabel = new JLabel("Account Balance: ₱0.00");
        balanceLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        balanceLabel.setBounds(50, 70, 400, 25);
        add(balanceLabel);

        // Placeholder background
        backgroundLabel = new JLabel("BACKGROUND IMAGE HERE");
        backgroundLabel.setHorizontalAlignment(SwingConstants.CENTER);
        backgroundLabel.setBounds(0, 120, 900, 400);
        add(backgroundLabel);
    }

    // Setters to update username & balance dynamically
    public void setUsername(String name) {
        helloLabel.setText("Hello, " + name + "!");
    }

    public void setBalance(String balance) {
        balanceLabel.setText("Account Balance: ₱" + balance);
    }
}