package design.patterns.creational.abstractfactory.impl;
/**
 * @author nayanava
 */

import design.patterns.creational.abstractfactory.CardType;
import design.patterns.creational.abstractfactory.CreditCardFactory;
import design.patterns.creational.abstractfactory.factory.CreditCard;
import design.patterns.creational.abstractfactory.factory.impl.AmexGoldCard;
import design.patterns.creational.abstractfactory.factory.impl.AmexPlatinumCard;
import design.patterns.creational.abstractfactory.validator.Validator;
import design.patterns.creational.abstractfactory.validator.impl.AmexGoldValidator;
import design.patterns.creational.abstractfactory.validator.impl.AmexPlatinumValidator;

public class AmexFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldCard();
            case PLATINUM:
                return new AmexPlatinumCard();
            default:
                throw new IllegalArgumentException();
        }

    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
            default:
                throw new IllegalArgumentException();
        }
    }
}
