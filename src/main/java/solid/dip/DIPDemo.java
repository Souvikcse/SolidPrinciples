package solid.dip;
/**
 * @author nayanava
 */

import java.io.*;
import java.util.stream.Collectors;

public class DIPDemo {
    public static void main(String[] args) {
        IRelationshipProvider rp = Relationships.getInstance();
        ResearchOnFamily rof = new ResearchOnFamily(rp);
        Person p = new Person("X");
        Person p1 = new Person("Y");
        Person p2 = new Person("Z");
        rp.addParentAndChild(p, p1);
        rp.addParentAndChild(p, p2);

        Research research = new Research();

        Relationships r = Relationships.getInstance();
        System.out.println("Violated approach");
        research.getChildrenOf(p, Relationship.PARENT, r)
                .forEach(person -> System.out.println(person.getName()));

        System.out.println("Right approach");
        rof.getRelations(p, Relationship.PARENT)
                .forEach(person -> System.out.println(person.getName()));

        rof.getRelations(p1, Relationship.CHILD)
                .forEach(person -> System.out.println(person.getName()));

    }
}
