package hometasks.annotations
import groovy.transform.Canonical

class CanonicalExample {
    // Canonical replaces @EqualsAndHashCode, @ToString

    static void main(String[] args) {
        def m1 = new CanonicalExample.Man(name:"Man1", age:20)
        def m2 = new CanonicalExample.Man(name:"Man2", age:30)
        def m3 = new CanonicalExample.Man("Man3", 40)

        println m1.toString()
        println m2.toString()

        assert m1 != m2
        assert !m1.is(m2)

        println m1.hashCode()
        println m2.hashCode()
    }

    @Canonical
    static class Man {
        String name
        int age
    }
}