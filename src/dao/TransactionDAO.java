package dao;

import model.Transaction;
import java.util.List;

/**
 * TransactionDAO provides CRUD operations for the Transaction entity.
 * It contains methods for inserting, reading, and deleting
 * Transaction records from the database.
 *
 * @author Khen Lagusad
 * @version 1.0
 */
public class TransactionDAO {

    /**
     * Retrieves a single Transaction from the database by transaction ID.
     *
     * @param transaction_id the unique ID of the transaction
     * @return Transaction object corresponding to the given ID
     */
    public Transaction getTransaction(String transaction_id){
        // SQL Statement
        return null;
    }

    /**
     * Retrieves all transactions from the database.
     *
     * @return List of all Transaction objects
     */
    public List<Transaction> getTransactions(){
        // SQL Statement
        return null;
    }

    /**
     * Inserts a new transaction into the database.
     *
     * @param transaction the Transaction object containing transaction information
     */
    public void insertTransaction(Transaction transaction){
        // SQL Statement
    }

    /**
     * Deletes a transaction from the database by transaction ID.
     *
     * @param transaction_id the unique ID of the transaction to delete
     */
    public void deleteTransaction(String transaction_id){
        // SQL Statement
    }
}