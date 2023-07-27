package with.templatemethod;

public abstract class PaymentProcessor {

    protected void pay(double amount, String currency){
        double dollarAmt = convertToUSD(amount,currency);
        performPayment(dollarAmt);
    }

    protected double convertToUSD(double amount, String currency){
        double dollarAmount = amount;

        if (currency.contentEquals("EUR")) { // European Euro
            dollarAmount = amount * 1.1;
            System.out.println("Convert "+amount+" "+currency+" to US dollars");

        }
        if (currency.contentEquals("INR")) { // Indian Rupee
            dollarAmount = amount * 0.014;
            System.out.println("Convert "+amount+" "+currency+" to US dollars");

        }
        return dollarAmount;
    }

    abstract boolean validate();

    abstract void performPayment(double dollarAmount);

    abstract void notifyCustomer();
}
