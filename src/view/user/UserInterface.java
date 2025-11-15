package view.user;

import javax.swing.*;
import java.awt.*;

public class UserInterface extends JFrame {
    private JPanel contentPanel;
    private CardLayout cardLayout;

    private SidePanel sidePanel;
    private HomePageInterface homePage;

    public UserInterface() {
        setTitle("User");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        sidePanel = new SidePanel();
        add(sidePanel, BorderLayout.WEST);

        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);

        // Instantiate HOME PAGE
        homePage = new HomePageInterface();

        // Add HOME PAGE to cards
        contentPanel.add(homePage, "HOME");

        // Add BOOK PAGE (placeholder)
        contentPanel.add(new JPanel(){{
            add(new JLabel("Book Tour Page"));
        }}, "BOOK");

        add(contentPanel, BorderLayout.CENTER);

        // Click Events for Navigation
        sidePanel.labelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                cardLayout.show(contentPanel, "HOME");
            }
        });

        sidePanel.labelBookTour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                cardLayout.show(contentPanel, "BOOK");
            }
        });

        setVisible(true);
    }

    // Public method so controller can update home screen details
    public void updateHome(String username, String balance) {
        homePage.setUsername(username);
        homePage.setBalance(balance);
    }
}
