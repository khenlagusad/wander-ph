package view.user;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class ManageBookingsInterface extends JPanel {

    private JLabel titleLabel;
    private JTable bookingsTable;
    private JScrollPane scrollPane;

    private JPanel bookingPanel;
    private JLabel bookingIdLabel;
    private JTextField bookingIdField;
    private JButton cancelButton;
    private JButton clearButton;

    private DefaultTableModel tableModel;

    public ManageBookingsInterface() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        initComponents();
        addSampleData();
    }

    private void initComponents() {
        // -------------------
        // Title
        // -------------------
        titleLabel = new JLabel("Your Active Bookings");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 26));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setForeground(new Color(0, 102, 204));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(titleLabel, BorderLayout.NORTH);

        // -------------------
        // Table setup
        // -------------------
        String[] columns = {"Booking ID", "Tour Name", "Pax Booked", "Booking Date", "Booking Time"};
        tableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) { return false; }
        };
        bookingsTable = new JTable(tableModel);
        bookingsTable.setRowHeight(25);
        scrollPane = new JScrollPane(bookingsTable);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBorder(BorderFactory.createEmptyBorder(0, 50, 20, 50));
        contentPanel.setBackground(Color.WHITE);
        contentPanel.add(scrollPane, BorderLayout.CENTER);
        add(contentPanel, BorderLayout.CENTER);

        // -------------------
        // Booking Panel
        // -------------------
        bookingPanel = new JPanel(new GridBagLayout());
        bookingPanel.setBackground(new Color(245, 245, 245));
        bookingPanel.setBorder(BorderFactory.createTitledBorder("Manage Booking"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Booking ID
        bookingIdLabel = new JLabel("Booking ID:");
        gbc.gridx = 0; gbc.gridy = 0;
        bookingPanel.add(bookingIdLabel, gbc);

        bookingIdField = new JTextField();
        gbc.gridx = 1; gbc.gridy = 0;
        bookingPanel.add(bookingIdField, gbc);

        // Buttons
        cancelButton = new JButton("Cancel Booking");
        clearButton = new JButton("Clear");
        gbc.gridx = 0; gbc.gridy = 1;
        bookingPanel.add(cancelButton, gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        bookingPanel.add(clearButton, gbc);

        add(bookingPanel, BorderLayout.SOUTH);
    }

    private void addSampleData() {
        addBooking("B001", "Island Adventure", 2, "2025-11-15", "10:00");
        addBooking("B002", "Mountain Trekking", 4, "2025-11-16", "08:30");
        addBooking("B003", "Cultural City Tour", 1, "2025-11-17", "13:00");
    }

    // =========================
    // MVC-Friendly Methods
    // =========================
    public void setActionListener(ActionListener e){
        cancelButton.addActionListener(e);
        clearButton.addActionListener(e);
    }

    public String fetchBookingIdInput() { return bookingIdField.getText().trim(); }
    public void clearInputs() { bookingIdField.setText(""); }
    public void addBooking(String bookingId, String tourName, int pax, String date, String time) {
        tableModel.addRow(new Object[]{bookingId, tourName, pax, date, time});
    }
    public DefaultTableModel getTableModel() { return tableModel; }
}
