package design.patterns.behavioral.strategy.impl;
/**
 * @author nayanava
 */

import design.patterns.behavioral.strategy.PaymentStrategy;

public class CardPaymentStrategy implements PaymentStrategy {
    private String cardNumber;
    private String nameOnCard;
    private String monthAndYearOfExpiry;
    private int cvv;

    public CardPaymentStrategy() {

    }
    public CardPaymentStrategy(String cardNumber,
                               String nameOnCard,
                               String monthAndYearOfExpiry,
                               int cvv) {
        this.cardNumber = cardNumber;
        this.nameOnCard = nameOnCard;
        this.monthAndYearOfExpiry = monthAndYearOfExpiry;
        this.cvv = cvv;
    }

    @Override
    public String pay(double bill) {
        return String.format("An amount of %.2f has been deducted from your account using card number %s", bill, cardNumber);
    }
}
