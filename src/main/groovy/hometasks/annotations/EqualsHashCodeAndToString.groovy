package hometasks.annotations

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

class EqualsHashCodeAndToString {

    static void main(String[] args) {
        def m1 = new EqualsHashCodeAndToString.Man(name:"Man1", age:20)
        def m2 = new EqualsHashCodeAndToString.Man(name:"Man2", age:30)

        println m1
        println m2

        assert m1 != m2
        assert !m1.is(m2)

        println m1.hashCode()
        println m2.hashCode()
    }

    @EqualsAndHashCode
    @ToString(includeNames = true)
    static class Man {
        String name
        int age
    }
}