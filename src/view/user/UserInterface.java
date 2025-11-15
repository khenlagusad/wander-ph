package view.user;

import javax.swing.*;
import java.awt.*;

public class UserInterface extends JFrame {
    private JPanel contentPanel;
    private CardLayout cardLayout;

    private SidePanel sidePanel;
    private HomePageInterface homePage;
    private ViewToursInterface toursPage;
    private ViewTransactionsInterface transactionsPage;

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
        toursPage = new ViewToursInterface();
        transactionsPage = new ViewTransactionsInterface();

        // Add HOME PAGE to cards
        contentPanel.add(homePage, "HOME");
        contentPanel.add(toursPage, "VIEW TOURS");
        contentPanel.add(transactionsPage, "VIEW TRANSACTIONS");

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

        sidePanel.labelViewTours.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                cardLayout.show(contentPanel, "VIEW TOURS");
            }
        });

        sidePanel.labelViewTransactions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                cardLayout.show(contentPanel, "VIEW TRANSACTIONS");
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
