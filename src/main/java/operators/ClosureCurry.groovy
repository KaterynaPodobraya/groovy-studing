package operators

class ClosureCurry {
    public static void main(String[] args) {
        def baseClosure = {String item, int quantity, double price ->
                            println("I have bought $item of $quantity by price $price")
                           }

        baseClosure("ice cream", 1, 2.00)

        def curryClosure = baseClosure.curry("honey", 5)
        curryClosure(100.99)

        //rcurry
        def rcurry = baseClosure.rcurry(3.99)
        rcurry("coffee", 10)
        //ncurry
        def ncurry = baseClosure.ncurry(0, "tea")
        ncurry(5, 5.55)
    }
}
