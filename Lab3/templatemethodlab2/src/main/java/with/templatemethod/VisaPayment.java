package with.templatemethod;

public class VisaPayment extends PaymentProcessor{
    private Customer customer;
    private VisaCard visaCard;
    public VisaPayment(Customer customer, VisaCard visaCard) {
        super();
        this.customer = customer;
        this.visaCard = visaCard;
    }

    @Override
    boolean validate() {
        System.out.println("Validate visa card with card number " + visaCard.getCreditCardNumber());
        return true;
    }

    @Override
    void performPayment(double dollarAmount) {
        boolean validation = validate();
        if(validation){
            System.out.println("Perform payment with visa card with card number " + visaCard.getCreditCardNumber()
                    + " and amount $" + dollarAmount);
            notifyCustomer();
        }
    }

    @Override
    void notifyCustomer() {
        System.out.println("Notify customer " + customer.getName() + " with email " + customer.getEmail()
                    + " about visa credit card payment with card number " + visaCard.getCreditCardNumber());
    }
}
