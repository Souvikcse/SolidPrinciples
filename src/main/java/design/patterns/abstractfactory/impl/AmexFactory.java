package design.patterns.abstractfactory.impl;
/**
 * @author nayanava
 */

import design.patterns.abstractfactory.CardType;
import design.patterns.abstractfactory.CreditCardFactory;
import design.patterns.abstractfactory.factory.CreditCard;
import design.patterns.abstractfactory.factory.impl.AmexGoldCard;
import design.patterns.abstractfactory.factory.impl.AmexPlatinumCard;
import design.patterns.abstractfactory.validator.Validator;
import design.patterns.abstractfactory.validator.impl.AmexGoldValidator;
import design.patterns.abstractfactory.validator.impl.AmexPlatinumValidator;

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
