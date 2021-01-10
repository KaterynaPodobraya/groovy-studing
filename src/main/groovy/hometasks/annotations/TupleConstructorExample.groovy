package hometasks.annotations
import groovy.transform.Canonical
import groovy.transform.TupleConstructor

class TupleConstructorExample {
    // Allows to omit properties names

    static void main(String[] args) {
        def m1 = new TupleConstructorExample.Man(name:"Man1", age:20)
        def m3 = new TupleConstructorExample.Man("Man3", 40)
    }

    @TupleConstructor
    static class Man {
        String name
        int age
    }
}