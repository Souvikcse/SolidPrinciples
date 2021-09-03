package design.patterns.creational.abstractfactory.validator.impl;
/**
 * @author nayanava
 */

import design.patterns.creational.abstractfactory.factory.CreditCard;
import design.patterns.creational.abstractfactory.validator.Validator;

public class AmexGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
