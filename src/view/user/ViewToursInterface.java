package view.user;

import javax.swing.*;
import java.awt.*;

public class ViewToursInterface extends JPanel {
    private JPanel listPanel;
    private JScrollPane scrollPane;

    public ViewToursInterface() {
        setLayout(new BorderLayout());

        listPanel = new JPanel();
        listPanel.setLayout(new BoxLayout(listPanel, BoxLayout.Y_AXIS));
        listPanel.setBackground(Color.WHITE);

        scrollPane = new JScrollPane(listPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        add(scrollPane, BorderLayout.CENTER);

        // Add sample tours
        addTour(
                "Island Adventure",
                "A fun day exploring nearby islands with snorkeling and kayaking.",
                "₱2,500",
                "Pier 7, Cebu City",
                "8 hours",
                "20",
                4
        );

        addTour(
                "Mountain Trekking",
                "Trek up scenic trails and enjoy breathtaking views.",
                "₱1,800",
                "Barangay Base Camp, Davao",
                "6 hours",
                "15",
                5
        );

        addTour(
                "Cultural City Tour",
                "Visit historical landmarks, museums, and local markets.",
                "₱1,200",
                "Main Plaza, Manila",
                "4 hours",
                "25",
                3
        );

        addTour(
                "Beach Relaxation",
                "Spend the day on pristine beaches with optional water activities.",
                "₱2,000",
                "White Beach, Boracay",
                "Full Day",
                "30",
                5
        );

        addTour(
                "Beach Relaxation",
                "Spend the day on pristine beaches with optional water activities.",
                "₱2,000",
                "White Beach, Boracay",
                "Full Day",
                "30",
                5
        );

        addTour(
                "Beach Relaxation",
                "Spend the day on pristine beaches with optional water activities.",
                "₱2,000",
                "White Beach, Boracay",
                "Full Day",
                "30",
                5
        );
    }

    private void addTour(String name, String description, String price,
                         String meetingPoint, String duration, String maxCapacity, double rating) {

        JPanel tourPanel = new JPanel(new BorderLayout(15, 0));
        tourPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 160)); // full width and slightly taller
        tourPanel.setBackground(new Color(245, 245, 245));
        tourPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200), 1, true),
                BorderFactory.createEmptyBorder(10, 15, 10, 15)
        ));

        // Left info panel
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
        infoPanel.setOpaque(false);

        JLabel nameLabel = new JLabel(name);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 20)); // Tour Name bigger
        nameLabel.setForeground(new Color(0, 102, 204)); // Dodger Blue
        infoPanel.add(nameLabel);
        infoPanel.add(Box.createVerticalStrut(3)); // small gap between name and description

        JLabel descLabel = new JLabel("<html><body style='width:400px'>" + description + "</body></html>");
        descLabel.setFont(new Font("Arial", Font.PLAIN, 14)); // slightly larger than other details
        descLabel.setForeground(new Color(80, 80, 80)); // dark gray
        infoPanel.add(descLabel);
        infoPanel.add(Box.createVerticalStrut(10)); // bigger gap before other info

        infoPanel.add(new JLabel("Meeting Point: " + meetingPoint));
        infoPanel.add(new JLabel("Duration: " + duration));
        infoPanel.add(new JLabel("Max Capacity: " + maxCapacity));

        // Right panel for Price + Rating
        JPanel rightPanel = new JPanel();
        rightPanel.setOpaque(false);
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));

        JLabel priceLabel = new JLabel(price);
        priceLabel.setFont(new Font("Arial", Font.BOLD, 18));
        priceLabel.setForeground(new Color(0, 128, 0)); // green

        JLabel ratingLabel = new JLabel("Rating: " + rating);
        ratingLabel.setFont(new Font("Arial", Font.BOLD, 16));
        ratingLabel.setForeground(new Color(200, 150, 50));

        rightPanel.add(Box.createVerticalGlue());
        rightPanel.add(priceLabel);
        rightPanel.add(Box.createVerticalStrut(10));
        rightPanel.add(ratingLabel);
        rightPanel.add(Box.createVerticalGlue());

        tourPanel.add(infoPanel, BorderLayout.WEST);
        tourPanel.add(rightPanel, BorderLayout.EAST);

        // Add to main scrollable panel
        listPanel.add(tourPanel);
        listPanel.add(Box.createVerticalStrut(5)); // spacing between tours

        listPanel.revalidate();
        listPanel.repaint();
    }
}