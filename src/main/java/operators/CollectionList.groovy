package operators

class CollectionList {
//http://docs.groovy-lang.org/latest/html/groovy-jdk/java/util/List.html

    public static void main(String[] args) {
        List<String> names = ["Bob", "Roy", "Mark", "Adam"]
        List<String> immutableNames = names.asImmutable() //throws UnsupportedOperationException
        names.add("Ben")
        //immutableNames.add("Ben")


    }
}
