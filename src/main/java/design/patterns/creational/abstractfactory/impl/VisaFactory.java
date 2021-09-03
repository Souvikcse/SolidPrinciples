package design.patterns.creational.abstractfactory.impl;
/**
 * @author nayanava
 */

import design.patterns.creational.abstractfactory.CardType;
import design.patterns.creational.abstractfactory.CreditCardFactory;
import design.patterns.creational.abstractfactory.factory.CreditCard;
import design.patterns.creational.abstractfactory.factory.impl.VisaGoldCard;
import design.patterns.creational.abstractfactory.factory.impl.VisaPlatinumCard;
import design.patterns.creational.abstractfactory.validator.Validator;
import design.patterns.creational.abstractfactory.validator.impl.VisaGoldValidator;
import design.patterns.creational.abstractfactory.validator.impl.VisaPlatinumValidator;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCard();
            case PLATINUM:
                return new VisaPlatinumCard();
            default:
                throw new IllegalArgumentException();
        }

    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldValidator();
            case PLATINUM:
                return new VisaPlatinumValidator();
            default:
                throw new IllegalArgumentException();
        }
    }
}
