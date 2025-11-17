package view.admin;

import javax.swing.*;
import java.awt.*;

public class AdminInterface extends JFrame {

    private JPanel contentPanel;
    private CardLayout cardLayout;
    private SidePanel sidePanel;

    // Placeholder pages (you will replace these later)
    private JPanel dashboardPage;
    private JPanel manageUsersPage;
    private JPanel manageToursPage;
    private JPanel transactionsPage;
    private JPanel reportsPage;

    public AdminInterface() {
        setTitle("Admin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // ===== SIDE PANEL =====
        sidePanel = new SidePanel();
        add(sidePanel, BorderLayout.WEST);

        // ===== CARD LAYOUT =====
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);

        // ===== PLACEHOLDER PAGES =====
        dashboardPage = createPlaceholder("ADMIN DASHBOARD");
        manageUsersPage = createPlaceholder("MANAGE USERS");
        manageToursPage = createPlaceholder("MANAGE TOURS");
        transactionsPage = createPlaceholder("VIEW TRANSACTIONS");
        reportsPage = createPlaceholder("REPORTS");

        // Add to card layout
        contentPanel.add(dashboardPage, "DASHBOARD");
        contentPanel.add(manageUsersPage, "MANAGE USERS");
        contentPanel.add(manageToursPage, "MANAGE TOURS");
        contentPanel.add(transactionsPage, "TRANSACTIONS");
        contentPanel.add(reportsPage, "REPORTS");

        add(contentPanel, BorderLayout.CENTER);

        // DO NOT ADD CLICK EVENTS YET
        // (You said to leave them for later)

        setVisible(true);
    }

    // Utility method for placeholder pages
    private JPanel createPlaceholder(String text) {
        JPanel panel = new JPanel();
        panel.add(new JLabel(text));
        return panel;
    }
}
