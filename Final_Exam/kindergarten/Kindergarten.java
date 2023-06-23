package kindergarten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Kindergarten {

    String name;
    int capacity;
    List<Child> registry;

    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.registry = new ArrayList<>();
    }

    public boolean addChild (Child child) {
        if (this.capacity > this.registry.size()) {
            this.registry.add(child);
            return true;
        }
        return  false;
    }
    public boolean removeChild (String firstName) {
        for (Child child : registry) {
            if (child.getFirstName().equals(firstName)) {
                registry.remove(child);
                return true;
            }
        }
        return false;
    }

    public int getChildrenCount () {
        return this.registry.size();
    }

    public Child getChild (String firstName) {
        for (Child child : registry) {
            if (child.getFirstName().equals(firstName)) {
                return  child;
            }
    } return null;
}
public String registryReport () {
    StringBuilder report = new StringBuilder();
    report.append(String.format("Registered children in %s:%n", this.name));

    Comparator<Child> comparator = Comparator
            .comparing(Child::getAge)
            .thenComparing(Child::getFirstName)
            .thenComparing(Child::getLastName);

            Collections.sort(registry, comparator);


//    this.registry.sort((l, r) -> l.getAge() - r.getAge());
//    this.registry.sort((l, r) -> l.getFirstName().compareTo(r.getFirstName()));
//    this.registry.sort((l, r) -> l.getLastName().compareTo(r.getLastName()));
    for (Child child : registry) {
        report.append(child.toString());
    }
    return report.toString();
}
}
