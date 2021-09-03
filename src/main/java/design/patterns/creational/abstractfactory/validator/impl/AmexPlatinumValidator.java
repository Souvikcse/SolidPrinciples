package design.patterns.creational.abstractfactory.validator.impl;
/**
 * @author nayanava
 */

import design.patterns.creational.abstractfactory.factory.CreditCard;
import design.patterns.creational.abstractfactory.validator.Validator;

public class AmexPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
