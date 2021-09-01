package solid.dip;

import java.util.List;

/**
 * @author nayanava
 */
public interface IRelationshipProvider {
    void addParentAndChild(Person parent, Person child);
    List<Person> findAllRelationsOf(Person person, Relationship relationship);
}
