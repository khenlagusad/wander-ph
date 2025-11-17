package view.admin;

import javax.swing.*;
import java.awt.*;

public class SidePanel extends JPanel {

    public JLabel labelDashboard, labelManageUsers, labelManageTours,
            labelManageTourEvents, labelManageTransactions, labelLogout;

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
        // LOGO PANEL (same design)
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
        // MENU LABELS (same design)
        // -----------------------
        labelDashboard = createMenuLabel("Dashboard");
        labelManageUsers = createMenuLabel("Manage Users");
        labelManageTours = createMenuLabel("Manage Tours");
        labelManageTourEvents = createMenuLabel("Manage Tour Events");
        labelManageTransactions = createMenuLabel("Manage Transactions");

        labelLogout = createMenuLabel("Logout");
        labelLogout.setForeground(new Color(255, 120, 120)); // red logout

        // -----------------------
        // ADD COMPONENTS
        // -----------------------
        add(logoPanel);
        add(Box.createVerticalStrut(25));

        add(labelDashboard);
        add(labelManageUsers);
        add(labelManageTours);
        add(labelManageTourEvents);
        add(labelManageTransactions);

        add(Box.createVerticalGlue());

        add(labelLogout);
        add(Box.createVerticalStrut(15));
    }

    // --------------------------------------------------
    // SAME LABEL STYLE AS USER PANEL
    // --------------------------------------------------
    private JLabel createMenuLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("SansSerif", Font.PLAIN, 15));
        label.setForeground(Color.WHITE);
        label.setOpaque(true);
        label.setBackground(new Color(46, 49, 49));
        label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        label.setAlignmentX(Component.LEFT_ALIGNMENT);

        label.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        label.setPreferredSize(new Dimension(200, 40));
        label.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 5));

        addHoverEffect(label);
        return label;
    }

    // --------------------------------------------------
    // SAME HOVER EFFECT
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
