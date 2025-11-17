package view.admin;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TopUsersPanel extends JPanel {
    private JLabel titleLabel;
    private JTable usersTable;
    private JScrollPane scrollPane;
    private DefaultTableModel tableModel;

    public TopUsersPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        initComponents();
        addSampleData();
    }

    private void initComponents() {
        titleLabel = new JLabel("Top 10 Users with Most Bookings per Month");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 26));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setForeground(new Color(0, 102, 204));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(titleLabel, BorderLayout.NORTH);

        String[] columns = {"User ID", "Full Name", "Year", "Month", "Total Bookings"};
        tableModel = new DefaultTableModel(columns, 0) {
            @Override public boolean isCellEditable(int row, int column) { return false; }
        };

        usersTable = new JTable(tableModel);
        usersTable.setRowHeight(25);
        scrollPane = new JScrollPane(usersTable);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBorder(BorderFactory.createEmptyBorder(0, 50, 20, 50));
        contentPanel.setBackground(Color.WHITE);
        contentPanel.add(scrollPane, BorderLayout.CENTER);

        add(contentPanel, BorderLayout.CENTER);
    }

    private void addSampleData() {
        tableModel.addRow(new Object[]{"U001", "John Doe", 2025, "December", 12});
        tableModel.addRow(new Object[]{"U002", "Jane Smith", 2025, "December", 10});
        tableModel.addRow(new Object[]{"U003", "Alex Cruz", 2025, "December", 9});
    }

    public DefaultTableModel getTableModel() { return tableModel; }
}