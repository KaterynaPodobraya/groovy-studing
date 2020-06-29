package operators

class SwitchExample {

     static void main(String[] args) {
        check(30.9999f)
        check("Test")
    }

    private static void check(def c){
        switch (c) {
            case 10:
                println (10 * 2)
                break
            case "Test":
                println(c)
                break
            case 1..10:
                println(1..10)
                break
            case Float:
                println("parameter is a Float")
                break
            case [10, 20, 30]:
                println(c)
                break
            default:
                println("Smth default")
        }
    }
}
