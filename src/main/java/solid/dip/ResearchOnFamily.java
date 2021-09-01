package solid.dip;
/**
 * @author nayanava
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.stream.Stream;

//high level module
public class ResearchOnFamily {
    private Relationships relationships;

    private IRelationshipProvider relationshipProvider;
    public ResearchOnFamily(Relationships relationships) {
        this.relationships = relationships;
    }

    public ResearchOnFamily(IRelationshipProvider relationshipProvider) {
        this.relationshipProvider = relationshipProvider;
    }
    public Stream<Person> getRelationsViolatingDIP(Person person, Relationship relationship) {
        return relationships.getRelations()
                .getOrDefault(relationship, new HashMap<>())
                .getOrDefault(person, new LinkedList<>())
                .stream();
    }

    public Stream<Person> getRelations(Person person, Relationship relationship) {
        return relationshipProvider.findAllRelationsOf(person, relationship)
                .stream();
    }
}
