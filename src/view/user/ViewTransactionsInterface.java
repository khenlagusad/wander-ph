package view.user;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewTransactionsInterface extends JPanel {

    private JLabel titleLabel;
    private JPanel mainPanel;
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
        addTransaction("TOP UP", 5000.0, "2025-11-15", "10:30");
        addTransaction("PAYMENT", 2500.0, "2025-11-15", "15:30");
        addTransaction("REFUND", 800.0, "2025-11-16", "09:45");
        addTransaction("PAYMENT", 1200.0, "2025-11-16", "14:20");
        addTransaction("TOP UP", 3000.0, "2025-11-17", "11:10");
    }

    private void initComponents() {
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);

        // Title
        titleLabel = new JLabel("Your Transactions");
        titleLabel.setFont(new Font("Tahoma", Font.BOLD, 32)); // slightly smaller
        titleLabel.setForeground(new Color(0, 102, 204));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Table model
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
        transactionTable.setFont(new Font("SansSerif", Font.PLAIN, 12)); // smaller entries
        transactionTable.setGridColor(new Color(220, 220, 220));
        transactionTable.setIntercellSpacing(new Dimension(15, 5));

        // Headers bigger, bold, centered
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

        // Apply renderer

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

        // Layout
        mainPanel.setLayout(new BorderLayout(0, 15));
        mainPanel.add(titleLabel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);
    }

    public void addTransaction(String type, double amount, String date, String time) {
        DefaultTableModel model = (DefaultTableModel) transactionTable.getModel();
        model.addRow(new Object[]{type, amount, date, time});
    }
}
