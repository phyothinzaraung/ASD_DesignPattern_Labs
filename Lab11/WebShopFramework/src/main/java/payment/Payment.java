package payment;

import java.util.Date;

public class Payment {
    private int creditcard_number;
    private Date validation_date;
    private String creditcard_type;

    public int getCreditcard_number() {
        return creditcard_number;
    }

    public void setCreditcard_number(int creditcard_number) {
        this.creditcard_number = creditcard_number;
    }

    public Date getValidation_date() {
        return validation_date;
    }

    public void setValidation_date(Date validation_date) {
        this.validation_date = validation_date;
    }

    public String getCreditcard_type() {
        return creditcard_type;
    }

    public void setCreditcard_type(String creditcard_type) {
        this.creditcard_type = creditcard_type;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "creditcard_number=" + creditcard_number +
                ", validation_date=" + validation_date +
                ", creditcard_type='" + creditcard_type + '\'' +
                '}';
    }
}
