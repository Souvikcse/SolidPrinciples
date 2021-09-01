package solid.dip;
/**
 * @author nayanava
 */

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class Research {

    //given a parent return all the children
    public List<Person> getChildrenOf(Person person, Relationship relationship, Relationships relationships) {
        return relationships.getRelations()
                .getOrDefault(relationship, new HashMap<>())
                .getOrDefault(person, new LinkedList<>());
    }

    //
}
