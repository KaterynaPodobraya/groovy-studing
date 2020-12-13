package hometasks.operators

class CollectionMap {

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

        test.each { println "This a key ${it.getKey()} and this is a value ${it.getValue()}"}
    }
}