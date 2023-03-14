package Common;

import java.util.Date;

public class Transaction {

    private String TransactionType; // Deposito/Retiro/Transferencia
    private Date TransactionDate;
    private String OriginAccount;
    private String DestinationAccount;
    private Double Amount;

    

    public Transaction() {
    }
    
    public String getTransactionType() {
        return TransactionType;
    }
    public void setTransactionType(String transactionType) {
        TransactionType = transactionType;
    }
    public Date getTransactionDate() {
        return TransactionDate;
    }
    public void setTransactionDate(Date transactionDate) {
        TransactionDate = transactionDate;
    }
    public String getOriginAccount() {
        return OriginAccount;
    }
    public void setOriginAccount(String originAccount) {
        OriginAccount = originAccount;
    }
    public String getDestinationAccount() {
        return DestinationAccount;
    }
    public void setDestinationAccount(String destinationAccount) {
        DestinationAccount = destinationAccount;
    }
    public Double getAmount() {
        return Amount;
    }
    public void setAmount(Double amount) {
        Amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction [TransactionType =" + TransactionType + ", TransactionDate =" + TransactionDate
                + ", OriginAccount =" + OriginAccount + ", DestinationAccount =" + DestinationAccount + ", Amount ="
                + Amount + "]";
    }
        
    
}
