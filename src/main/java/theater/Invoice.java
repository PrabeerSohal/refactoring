package theater;

import java.util.List;

/**
 * Class representing an invoice for a customer.
 */
public class Invoice {

    private final String customer;
    private final List<Performance> performances;

    /**
     * Create a new invoice.
     *
     * @param customer the customer name
     * @param performances the list of performances
     */
    public Invoice(String customer, List<Performance> performances) {
        this.customer = customer;
        this.performances = performances;
    }

    /**
     * Get the customer name.
     *
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Get the list of performances.
     *
     * @return the performances
     */
    public List<Performance> getPerformances() {
        return performances;
    }
}
