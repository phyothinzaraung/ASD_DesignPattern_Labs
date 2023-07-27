package with.templatemethod;

public class PaypalPayment extends PaymentProcessor{

    private Customer customer;
    public PaypalPayment(Customer customer) {
        super();
        this.customer = customer;
    }

    @Override
    boolean validate() {
        System.out.println("Validate paypal address "+customer.getEmail());
        return true;
    }

    @Override
    void performPayment(double dollarAmount) {
        boolean validation = validate();
        if (validation) {
            // logic to perform paypal payment
            System.out.println("Perform payment with paypal address "+customer.getEmail()+" and amount $"+dollarAmount);
            notifyCustomer();
        }
    }

    @Override
    void notifyCustomer() {
        // logic to notify customer
        System.out.println("Notify customer "+customer.getName()+" with email "+customer.getEmail()+" about paypal payment to address "+customer.getEmail());
    }
}
