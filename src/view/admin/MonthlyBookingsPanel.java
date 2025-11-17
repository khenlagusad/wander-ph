package view.admin;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MonthlyBookingsPanel extends JPanel {
    private JLabel titleLabel;
    private JTable bookingsTable;
    private JScrollPane scrollPane;
    private DefaultTableModel tableModel;

    public MonthlyBookingsPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        initComponents();
        addSampleData();
    }

    private void initComponents() {
        titleLabel = new JLabel("Monthly Bookings per Tour");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 26));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setForeground(new Color(0, 102, 204));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(titleLabel, BorderLayout.NORTH);

        String[] columns = {"Tour Name", "Year", "Month", "Total Bookings"};
        tableModel = new DefaultTableModel(columns, 0) {
            @Override public boolean isCellEditable(int row, int column) { return false; }
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
    }

    private void addSampleData() {
        tableModel.addRow(new Object[]{"Island Adventure", 2025, "December", 25});
        tableModel.addRow(new Object[]{"Mountain Trekking", 2025, "December", 18});
        tableModel.addRow(new Object[]{"Cultural City Tour", 2025, "December", 30});
    }

    public DefaultTableModel getTableModel() { return tableModel; }
}