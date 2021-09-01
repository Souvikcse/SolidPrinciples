package design.patterns.abstractfactory.impl;
/**
 * @author nayanava
 */

import design.patterns.abstractfactory.CardType;
import design.patterns.abstractfactory.CreditCardFactory;
import design.patterns.abstractfactory.factory.CreditCard;
import design.patterns.abstractfactory.factory.impl.VisaGoldCard;
import design.patterns.abstractfactory.factory.impl.VisaPlatinumCard;
import design.patterns.abstractfactory.validator.Validator;
import design.patterns.abstractfactory.validator.impl.VisaGoldValidator;
import design.patterns.abstractfactory.validator.impl.VisaPlatinumValidator;

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
