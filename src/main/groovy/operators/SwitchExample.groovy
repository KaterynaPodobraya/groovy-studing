package operators

class SwitchExample {

     static void main(String[] args) {
        check(30)
   //     println("test")
    }

    private static void check(int c){
        switch (c) {
            case 10:
                println (10 * 2)
                break
            case 25:
                println(c)
                break
            case 1..10:
                println(1..10)
                break
            case Float:
                println("parameter is an Integer")
                break
            case [10, 20, 30]:
                println(c)
                break
            default:
                println("Smth default")
        }
    }
}
