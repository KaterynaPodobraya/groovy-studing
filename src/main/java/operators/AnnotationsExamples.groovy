package operators

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode
@ToString
class AnnotationsExamples {

    static void main(String[] args) {
        def m1 = new AnnotationsExamples.Man(name:"Man1", age:20)
        def m2 = new AnnotationsExamples.Man(name:"Man2", age:30)

        assert m1.equals(m2)
        println m1.hashCode()
        println m2.hashCode()
    }

    static class Man {
        String name
        int age
    }
}