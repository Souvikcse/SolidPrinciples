package design.patterns.abstractfactory;
/**
 * @author nayanava
 */

import design.patterns.abstractfactory.factory.CreditCard;
import design.patterns.abstractfactory.impl.AmexFactory;
import design.patterns.abstractfactory.impl.VisaFactory;
import design.patterns.abstractfactory.validator.Validator;

public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if(creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
