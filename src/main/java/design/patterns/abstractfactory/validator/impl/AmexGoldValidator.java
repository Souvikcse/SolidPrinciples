package design.patterns.abstractfactory.validator.impl;
/**
 * @author nayanava
 */

import design.patterns.abstractfactory.factory.CreditCard;
import design.patterns.abstractfactory.validator.Validator;

import java.io.*;

public class AmexGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}