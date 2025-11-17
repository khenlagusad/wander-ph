package view.user;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BookTourInterface extends JPanel {
    private JLabel titleLabel;
    private JTable toursTable;
    private JScrollPane scrollPane;

    private JPanel bookingPanel;
    private JLabel eventIdLabel, ticketsLabel;
    private JTextField eventIdField, ticketsField;
    private JButton bookButton, clearButton;

    private DefaultTableModel tableModel;

    public BookTourInterface() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        initComponents();
        addSampleData();
    }

    private void initComponents() {
        // -------------------
        // Title
        // -------------------
        titleLabel = new JLabel("Active Tour Events");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 26));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setForeground(new Color(0, 102, 204));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(titleLabel, BorderLayout.NORTH);

        // -------------------
        // Table setup
        // -------------------
        String[] columns = {"Event ID", "Tour Name", "Event Date", "Start Time", "Current Capacity"};
        tableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        toursTable = new JTable(tableModel);
        toursTable.setRowHeight(25);
        scrollPane = new JScrollPane(toursTable);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBorder(BorderFactory.createEmptyBorder(0, 50, 20, 50));
        contentPanel.setBackground(Color.WHITE);
        contentPanel.add(scrollPane, BorderLayout.CENTER);
        add(contentPanel, BorderLayout.CENTER);

        // -------------------
        // Booking Panel (Simpler design)
        // -------------------
        bookingPanel = new JPanel(new GridBagLayout());
        bookingPanel.setBackground(new Color(245, 245, 245)); // light gray
        bookingPanel.setBorder(BorderFactory.createTitledBorder("Book a Tour"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Event ID
        eventIdLabel = new JLabel("Event ID:");
        gbc.gridx = 0; gbc.gridy = 0;
        bookingPanel.add(eventIdLabel, gbc);

        eventIdField = new JTextField();
        gbc.gridx = 1;
        bookingPanel.add(eventIdField, gbc);

        // Tickets
        ticketsLabel = new JLabel("Tickets:");
        gbc.gridx = 0; gbc.gridy = 1;
        bookingPanel.add(ticketsLabel, gbc);

        ticketsField = new JTextField();
        allowOnlyNumbers(ticketsField);
        gbc.gridx = 1;
        bookingPanel.add(ticketsField, gbc);

        // Buttons
        bookButton = new JButton("Book");
        clearButton = new JButton("Clear");
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 1;
        bookingPanel.add(bookButton, gbc);
        gbc.gridx = 1;
        bookingPanel.add(clearButton, gbc);

        add(bookingPanel, BorderLayout.SOUTH);
    }

    private void addSampleData() {
        addTourEvent("T001", "Island Adventure", "2025-12-05", "08:00", 12, 15);
        addTourEvent("T002", "Mountain Trekking", "2025-12-06", "07:30", 8, 15);
        addTourEvent("T003", "Cultural City Tour", "2025-12-07", "09:00", 20, 25);
    }

    private void allowOnlyNumbers(JTextField field) {
        ((AbstractDocument) field.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
                if (text.matches("\\d+")) super.insertString(fb, offset, text, attr);
            }
            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text.matches("\\d+")) super.replace(fb, offset, length, text, attrs);
            }
        });
    }

    // MVC-friendly
    public void setBookListener(ActionListener e) { bookButton.addActionListener(e); }
    public void setClearListener(ActionListener e) { clearButton.addActionListener(e); }
    public String fetchEventIdInput() { return eventIdField.getText(); }
    public String fetchTicketsInput() { return ticketsField.getText(); }
    public void clearInputs() { eventIdField.setText(""); ticketsField.setText(""); }
    public void addTourEvent(String eventId, String tourName, String date, String startTime, int current, int max) {
        tableModel.addRow(new Object[]{eventId, tourName, date, startTime, current + "/" + max});
    }
    public DefaultTableModel getTableModel() { return tableModel; }
}
