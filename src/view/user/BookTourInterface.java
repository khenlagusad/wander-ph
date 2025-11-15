package view.user;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class BookTourInterface extends JPanel {
    private JLabel titleLabel;
    private JTable toursTable;
    private JScrollPane scrollPane;

    // Booking panel components
    private JPanel bookingPanel;
    private JLabel eventIdLabel, ticketsLabel;
    private JTextField eventIdField, ticketsField;
    private JButton bookButton;

    private DefaultTableModel tableModel;

    public BookTourInterface() {
        setLayout(new BorderLayout());
        initComponents();
    }

    private void initComponents() {
        // Title
        titleLabel = new JLabel("Active Tour Events");
        titleLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel, BorderLayout.NORTH);

        // Table setup
        String[] columns = {"Event ID", "Tour Name", "Event Date", "Start Time", "Current Capacity"};
        tableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // non-editable cells
            }
        };
        toursTable = new JTable(tableModel);
        toursTable.setRowHeight(25);
        scrollPane = new JScrollPane(toursTable);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane, BorderLayout.CENTER);

        // Booking Panel
        bookingPanel = new JPanel();
        bookingPanel.setLayout(null);
        bookingPanel.setBackground(new Color(230, 230, 250));
        bookingPanel.setPreferredSize(new Dimension(0, 100));
        bookingPanel.setBorder(BorderFactory.createTitledBorder("Book a Tour"));

        // Event ID
        eventIdLabel = new JLabel("Event ID:");
        eventIdLabel.setBounds(20, 30, 80, 25);
        bookingPanel.add(eventIdLabel);

        eventIdField = new JTextField();
        eventIdField.setBounds(100, 30, 80, 25);
        bookingPanel.add(eventIdField);

        // Tickets
        ticketsLabel = new JLabel("Tickets:");
        ticketsLabel.setBounds(20, 65, 80, 25);
        bookingPanel.add(ticketsLabel);

        ticketsField = new JTextField();
        ticketsField.setBounds(100, 65, 80, 25);
        bookingPanel.add(ticketsField);

        // Book Button
        bookButton = new JButton("Book");
        bookButton.setBounds(220, 40, 100, 30);
        bookingPanel.add(bookButton);

        add(bookingPanel, BorderLayout.SOUTH);

        // Sample data
        addTourEvent("T001", "Island Adventure", "2025-12-05", "08:00", 12, 15);
        addTourEvent("T002", "Mountain Trekking", "2025-12-06", "07:30", 8, 15);
        addTourEvent("T003", "Cultural City Tour", "2025-12-07", "09:00", 20, 25);
        addTourEvent("T001", "Island Adventure", "2025-12-05", "08:00", 12, 15);
        addTourEvent("T002", "Mountain Trekking", "2025-12-06", "07:30", 8, 15);
        addTourEvent("T003", "Cultural City Tour", "2025-12-07", "09:00", 20, 25);
        addTourEvent("T001", "Island Adventure", "2025-12-05", "08:00", 12, 15);
        addTourEvent("T002", "Mountain Trekking", "2025-12-06", "07:30", 8, 15);
        addTourEvent("T003", "Cultural City Tour", "2025-12-07", "09:00", 20, 25);
        addTourEvent("T001", "Island Adventure", "2025-12-05", "08:00", 12, 15);
        addTourEvent("T002", "Mountain Trekking", "2025-12-06", "07:30", 8, 15);
        addTourEvent("T003", "Cultural City Tour", "2025-12-07", "09:00", 20, 25);
        addTourEvent("T001", "Island Adventure", "2025-12-05", "08:00", 12, 15);
        addTourEvent("T002", "Mountain Trekking", "2025-12-06", "07:30", 8, 15);
        addTourEvent("T003", "Cultural City Tour", "2025-12-07", "09:00", 20, 25);
        addTourEvent("T001", "Island Adventure", "2025-12-05", "08:00", 12, 15);
        addTourEvent("T002", "Mountain Trekking", "2025-12-06", "07:30", 8, 15);
        addTourEvent("T003", "Cultural City Tour", "2025-12-07", "09:00", 20, 25);
        addTourEvent("T001", "Island Adventure", "2025-12-05", "08:00", 12, 15);
        addTourEvent("T002", "Mountain Trekking", "2025-12-06", "07:30", 8, 15);
        addTourEvent("T003", "Cultural City Tour", "2025-12-07", "09:00", 20, 25);

    }

    public void setActionListener(ActionListener e){
        bookButton.addActionListener(e);
    }

    // Adds a tour event with current/max capacity
    public void addTourEvent(String eventId, String tourName, String date, String startTime, int current, int max) {
        tableModel.addRow(new Object[]{eventId, tourName, date, startTime, current + "/" + max});
    }

    // Getters for Controller
    public String fetchEventIdInput() {
        return eventIdField.getText();
    }

    public String fetchTicketsInput() {
        return ticketsField.getText();
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }
}
