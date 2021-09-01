package solid.dip;
/**
 * @author nayanava
 */

import java.util.*;

//low level module
public class Relationships implements IRelationshipProvider {

    public static Relationships instance;

    private Relationships() {
    }

    public static Relationships getInstance() {
        if(instance == null) {
            return instance = new Relationships();
        }
        return instance;
    }
    private Map<Relationship, Map<Person, List<Person>>> relations = new HashMap<>();

    public Map<Relationship, Map<Person, List<Person>>> getRelations() {
        return this.relations;
    }

    @Override
    public void addParentAndChild(Person parent, Person child) {
        relations.computeIfAbsent(Relationship.PARENT, x-> new HashMap<>())
                .computeIfAbsent(parent, x-> new LinkedList<>()).add(child);
        relations.computeIfAbsent(Relationship.CHILD, x-> new HashMap<>())
                .computeIfAbsent(child, x-> new LinkedList<>()).add(parent);
    }

    @Override
    public List<Person> findAllRelationsOf(Person person, Relationship relationship) {
        return relations.getOrDefault(relationship, new HashMap<>())
                .getOrDefault(person, new LinkedList<>());
    }
}
