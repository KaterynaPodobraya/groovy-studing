package operators

class CollectionMap {
//http://docs.groovy-lang.org/latest/html/groovy-jdk/java/util/List.html

    public static void main(String[] args) {
        String city = "testCity"
        Map test = [name: "Test", surname: "Testo", (city): "London"]

        println(test)

        for (entry in test) {
            println(entry)
        }

        for (key in test.keySet()) {
            println(key)
        }

        //each and eachWithIndex


    }
}