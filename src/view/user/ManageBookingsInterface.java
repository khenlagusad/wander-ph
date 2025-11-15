package view.user;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionListener;

public class ManageBookingsInterface extends JPanel {
    private JTable activeTable;
    private JTable pastTable;
    private DefaultTableModel activeTableModel;
    private DefaultTableModel pastTableModel;
    private JScrollPane activeScrollPane;
    private JScrollPane pastScrollPane;
    private JLabel activeLabel;
    private JLabel pastLabel;

    public ManageBookingsInterface() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        // Labels
        activeLabel = new JLabel("Active Bookings");
        activeLabel.setFont(new Font("Arial", Font.BOLD, 24));

        pastLabel = new JLabel("Past Bookings");
        pastLabel.setFont(new Font("Arial", Font.BOLD, 24));

        // Active Bookings Table
        String[] activeColumns = {"Booking ID", "Tour Name", "Pax Booked", "Booking Date", "Booking Time", "Cancel"};
        activeTableModel = new DefaultTableModel(null, activeColumns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 5; // Only Cancel button is editable
            }
        };
        activeTable = new JTable(activeTableModel);
        activeTable.getColumn("Cancel").setCellRenderer(new ButtonRenderer());
        activeTable.getColumn("Cancel").setCellEditor(new ButtonEditor(new JCheckBox(), "Cancel"));

        activeScrollPane = new JScrollPane(activeTable);

        // Past Bookings Table
        String[] pastColumns = {"Booking ID", "Tour Name", "Tour Guide", "Pax Booked", "Rate"};
        pastTableModel = new DefaultTableModel(null, pastColumns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 4; // Only Rate button is editable
            }
        };
        pastTable = new JTable(pastTableModel);
        pastTable.getColumn("Rate").setCellRenderer(new ButtonRenderer());
        pastTable.getColumn("Rate").setCellEditor(new ButtonEditor(new JCheckBox(), "Rate"));

        pastScrollPane = new JScrollPane(pastTable);

        // Layout
        JPanel tablesPanel = new JPanel();
        tablesPanel.setLayout(new BoxLayout(tablesPanel, BoxLayout.Y_AXIS));
        tablesPanel.add(activeLabel);
        tablesPanel.add(Box.createVerticalStrut(10));
        tablesPanel.add(activeScrollPane);
        tablesPanel.add(Box.createVerticalStrut(20));
        tablesPanel.add(pastLabel);
        tablesPanel.add(Box.createVerticalStrut(10));
        tablesPanel.add(pastScrollPane);

        add(tablesPanel, BorderLayout.CENTER);

        // Sample entries
        addActiveBooking("B001", "Island Adventure", 2, "2025-11-15", "10:00");
        addActiveBooking("B002", "Mountain Trekking", 4, "2025-11-16", "08:30");
        addActiveBooking("B003", "Cultural City Tour", 1, "2025-11-17", "13:00");

        addPastBooking("B004", "Beach Relaxation", "John Doe", 3);
        addPastBooking("B005", "Island Adventure", "Jane Smith", 2);
        addPastBooking("B006", "Mountain Trekking", "Carlos Reyes", 1);
    }

    // Add entry methods
    public void addActiveBooking(String bookingID, String tourName, int pax, String date, String time) {
        activeTableModel.addRow(new Object[]{bookingID, tourName, pax, date, time, "Cancel"});
    }

    public void addPastBooking(String bookingID, String tourName, String guide, int pax) {
        pastTableModel.addRow(new Object[]{bookingID, tourName, guide, pax, "Rate"});
    }

    // Renderer and editor for buttons
    private static class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                       boolean hasFocus, int row, int column) {
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }

    private static class ButtonEditor extends DefaultCellEditor {
        private JButton button;
        private String label;

        public ButtonEditor(JCheckBox checkBox, String label) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(true);
            this.label = label;

            button.addActionListener(e -> fireEditingStopped());
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            button.setText(label);
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            return label;
        }
    }

    // Getters for table models (MVC)
    public DefaultTableModel getActiveTableModel() {
        return activeTableModel;
    }

    public DefaultTableModel getPastTableModel() {
        return pastTableModel;
    }
}
