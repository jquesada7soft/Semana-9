package Common;

public class Account {
    public String Type;// Ahorro / Corriente
    public String AccountNumber;
    public Double Balance;
    public String Coin; // Dolares o Colones.

    public Account() {
        Type = "";
        AccountNumber = "";
        Balance = 0.00;
        Coin = "";
    }
}
