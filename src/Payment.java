public class Payment {
    private double amount;
    private String currency;
    private String paymentMethod;
    private boolean isSuccessful;
    private String paymentDate;

    public Payment(double amount, String currency, String paymentMethod, boolean isSuccessful, String paymentDate) {
        this.amount = amount;
        this.currency = currency;
        this.paymentMethod = paymentMethod;
        this.isSuccessful = isSuccessful;
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public String getPaymentDate() {
        return paymentDate;
    }
}