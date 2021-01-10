package hometasks.annotations

import groovy.transform.Immutable
import groovy.transform.TupleConstructor

class ImmutableExample {
    // Does not allow to mutate object

    static void main(String[] args) {
        def m1 = new ImmutableExample.Man(name:"Man1", age:20)
        try {
            m1.age = 20
        } catch (ReadOnlyPropertyException exception) {
            println exception
        }
    }

    @Immutable
    static class Man {
        String name
        int age
    }
}