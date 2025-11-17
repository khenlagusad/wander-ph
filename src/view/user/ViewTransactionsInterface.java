package view.user;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewTransactionsInterface extends JPanel {

    private JLabel titleLabel;
    private JPanel contentPanel;
    private JScrollPane scrollPane;
    private JTable transactionTable;

    public ViewTransactionsInterface() {
        initComponents();

        // Sample entries
        addTransaction("TOP UP", 5000.0, "2025-11-15", "10:30");
        addTransaction("PAYMENT", 2500.0, "2025-11-15", "15:30");
        addTransaction("REFUND", 800.0, "2025-11-16", "09:45");
        addTransaction("PAYMENT", 1200.0, "2025-11-16", "14:20");
        addTransaction("TOP UP", 3000.0, "2025-11-17", "11:10");
        addTransaction("TOP UP", 5000.0, "2025-11-15", "10:30");
        addTransaction("PAYMENT", 2500.0, "2025-11-15", "15:30");
        addTransaction("REFUND", 800.0, "2025-11-16", "09:45");
        addTransaction("PAYMENT", 1200.0, "2025-11-16", "14:20");
        addTransaction("TOP UP", 3000.0, "2025-11-17", "11:10");
        addTransaction("TOP UP", 5000.0, "2025-11-15", "10:30");
        addTransaction("PAYMENT", 2500.0, "2025-11-15", "15:30");
        addTransaction("REFUND", 800.0, "2025-11-16", "09:45");
        addTransaction("PAYMENT", 1200.0, "2025-11-16", "14:20");
        addTransaction("TOP UP", 3000.0, "2025-11-17", "11:10");
        addTransaction("TOP UP", 5000.0, "2025-11-15", "10:30");
        addTransaction("PAYMENT", 2500.0, "2025-11-15", "15:30");
        addTransaction("REFUND", 800.0, "2025-11-16", "09:45");
        addTransaction("PAYMENT", 1200.0, "2025-11-16", "14:20");
        addTransaction("TOP UP", 3000.0, "2025-11-17", "11:10");

    }

    private void initComponents() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        // -------------------
        // Title Label
        // -------------------
        titleLabel = new JLabel("Your Transactions");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 26)); // same size as Manage Profile
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setForeground(new Color(0, 102, 204));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0)); // top padding

        add(titleLabel, BorderLayout.NORTH);

        // -------------------
        // Content Panel (center)
        // -------------------
        contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setBorder(BorderFactory.createEmptyBorder(0, 50, 50, 50)); // padding around table

        // -------------------
        // Table model
        // -------------------
        String[] columns = {"Transaction Type", "Amount", "Transaction Date", "Transaction Time"};
        DefaultTableModel model = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 1 ? Double.class : String.class;
            }
        };

        transactionTable = new JTable(model);
        transactionTable.setRowHeight(26);
        transactionTable.setFillsViewportHeight(true);
        transactionTable.setFont(new Font("SansSerif", Font.PLAIN, 12));
        transactionTable.setGridColor(new Color(220, 220, 220));
        transactionTable.setIntercellSpacing(new Dimension(15, 5));

        // Headers
        transactionTable.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));
        ((DefaultTableCellRenderer) transactionTable.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(SwingConstants.CENTER);

        // Cell renderers
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);

        DefaultTableCellRenderer leftRendererWithPeso = new DefaultTableCellRenderer() {
            @Override
            public void setValue(Object value) {
                if (value instanceof Double) {
                    super.setValue("₱" + String.format("%,.2f", value));
                } else {
                    super.setValue(value);
                }
            }
        };
        leftRendererWithPeso.setHorizontalAlignment(SwingConstants.LEFT);

        transactionTable.getColumnModel().getColumn(0).setCellRenderer(leftRenderer);
        transactionTable.getColumnModel().getColumn(1).setCellRenderer(leftRendererWithPeso);
        transactionTable.getColumnModel().getColumn(2).setCellRenderer(leftRenderer);
        transactionTable.getColumnModel().getColumn(3).setCellRenderer(leftRenderer);

        // Column widths
        transactionTable.getColumnModel().getColumn(0).setPreferredWidth(150);
        transactionTable.getColumnModel().getColumn(1).setPreferredWidth(120);
        transactionTable.getColumnModel().getColumn(2).setPreferredWidth(150);
        transactionTable.getColumnModel().getColumn(3).setPreferredWidth(120);

        scrollPane = new JScrollPane(transactionTable);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        contentPanel.add(scrollPane, BorderLayout.CENTER);

        add(contentPanel, BorderLayout.CENTER);
    }

    public void addTransaction(String type, double amount, String date, String time) {
        DefaultTableModel model = (DefaultTableModel) transactionTable.getModel();
        model.addRow(new Object[]{type, amount, date, time});
    }
}
