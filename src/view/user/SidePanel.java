package view.user;

import javax.swing.*;
import java.awt.*;

public class SidePanel extends JPanel {

    public JLabel labelHome, labelViewTours, labelViewTransactions,
            labelBookTour, labelManageBooking, labelManageProfile,
            labelLogout;

    private JPanel logoPanel;
    private JLabel appLogo, appName;

    public SidePanel() {
        initComponents();
    }

    private void initComponents() {

        setBackground(new Color(46, 49, 49));
        setPreferredSize(new Dimension(220, 0));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // -----------------------
        // LOGO PANEL
        // -----------------------
        logoPanel = new JPanel();
        logoPanel.setBackground(new Color(46, 49, 49));
        logoPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 10));
        logoPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        appLogo = new JLabel();
        appLogo.setOpaque(true);
        appLogo.setBackground(new Color(153, 255, 204));
        appLogo.setPreferredSize(new Dimension(45, 45));

        appName = new JLabel("LakbayPH");
        appName.setFont(new Font("Verdana", Font.BOLD, 22));
        appName.setForeground(new Color(0, 153, 204));

        logoPanel.add(appLogo);
        logoPanel.add(appName);

        // -----------------------
        // MENU LABELS
        // -----------------------
        labelHome = createMenuLabel("Home");
        labelViewTours = createMenuLabel("View Tours");
        labelViewTransactions = createMenuLabel("View Transactions");
        labelBookTour = createMenuLabel("Book A Tour");
        labelManageBooking = createMenuLabel("Manage Booking");
        labelManageProfile = createMenuLabel("Manage Profile");

        labelLogout = createMenuLabel("Logout");
        labelLogout.setForeground(new Color(255, 120, 120));

        // -----------------------
        // ADD COMPONENTS
        // -----------------------
        add(logoPanel);
        add(Box.createVerticalStrut(25));

        add(labelHome);
        add(labelViewTours);
        add(labelViewTransactions);
        add(labelBookTour);
        add(labelManageBooking);
        add(labelManageProfile);

        add(Box.createVerticalGlue()); // pushes logout to bottom

        add(labelLogout);
        add(Box.createVerticalStrut(15));
    }

    // --------------------------------------------------
    // CREATE LABEL (Left aligned, uniform size)
    // --------------------------------------------------
    private JLabel createMenuLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("SansSerif", Font.PLAIN, 15));
        label.setForeground(Color.WHITE);
        label.setOpaque(true);
        label.setBackground(new Color(46, 49, 49));
        label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // important—forces left alignment
        label.setAlignmentX(Component.LEFT_ALIGNMENT);

        // uniform size (full width)
        label.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        label.setPreferredSize(new Dimension(200, 40));
        label.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 5));
        // left padding instead of spaces

        addHoverEffect(label);
        return label;
    }

    // --------------------------------------------------
    // Hover Effect
    // --------------------------------------------------
    private void addHoverEffect(JLabel label) {
        Color defaultColor = new Color(46, 49, 49);
        Color hoverColor = new Color(60, 63, 63);

        label.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label.setBackground(hoverColor);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label.setBackground(defaultColor);
            }
        });
    }
}
