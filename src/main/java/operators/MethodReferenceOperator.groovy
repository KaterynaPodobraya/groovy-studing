package operators

import static java.util.stream.Collectors.toList

class MethodReferenceOperator {

    static void main(String[] args) {
        methodRefs()
        def names = ["Mark", "Den", "August", "Bob"]
        def namesStartsD = names.stream().filter(name -> name.startsWith('D')).collect().toList()
        println namesStartsD
        // lambda with one parameter
        def namesUpperCase = names.stream().map(String::toUpperCase).collect().toList()
        println namesUpperCase
    }

    static void methodRefs() {
        assert 6G == [1G, 2G, 3G].stream().reduce(0G, BigInteger::add)
        assert 6G instanceof BigInteger

        assert [4G, 5G, 6G] == [1G, 2G, 3G].stream().map(3G::add).collect(toList())

        assert [1G, 2G, 3G] == [1L, 2L, 3L].stream().map(BigInteger::valueOf).collect(toList())

        assert [1G, 2G, 3G] == [1L, 2L, 3L].stream().map(3G::valueOf).collect(toList())
    }
}