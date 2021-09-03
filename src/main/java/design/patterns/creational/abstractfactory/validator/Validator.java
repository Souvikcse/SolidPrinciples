package design.patterns.creational.abstractfactory.validator;

import design.patterns.creational.abstractfactory.factory.CreditCard;

/**
 * @author nayanava
 */
public interface Validator {
    boolean isValid(CreditCard creditCard);
}
