package design.patterns.abstractfactory.validator;

import design.patterns.abstractfactory.factory.CreditCard;

/**
 * @author nayanava
 */
public interface Validator {
    boolean isValid(CreditCard creditCard);
}
