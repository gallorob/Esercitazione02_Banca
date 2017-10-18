/**
 * @author Roberto Gallotta
 */

public class Conto {
    private String iban, cf;
    private int saldo;

    // Costruttore con IBAN e CF
    public Conto(String iban, String cf) {
        this.iban = iban;
        this.cf = cf;
    }

    // Metodo prelievo (ritorna F o T)
    public boolean prelievo(double quant) {
        if (this.saldo >= quant) {
            this.saldo -= quant;
            return true;
        }
        else return false;
    }

    // Metodo deposito (ritorna F o T)
    public boolean deposito(double quant) {
        saldo += quant;
        return true;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getIban() {
        return iban;
    }
}
