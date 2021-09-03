package design.patterns.creational.abstractfactory;
/**
 * @author nayanava
 */

import design.patterns.creational.abstractfactory.factory.CreditCard;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(649);
        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(card2.getClass());
    }
}
