package hometasks

    def closureVar = {Integer a, Integer b -> a*b}

    protected Integer doMultiply(Closure closure){
        def a = 10
        def b = 5
       println closure(a,b)
    }

    doMultiply (closureVar)

    def names = ["Ben", "Mark", "Samuel", "Tom", "Ben", "Bob", "Tom", "Tom"]
    def names2 = ["Ben", "Ben", "Bob"]
    names.each {println(it)}
    names.each {name -> println(name)}

    def goods = [1: "key", 2: "book", 3:"pen"]
    goods.each{entry -> println(entry)}
    goods.each{k, v -> println("key ${k} and value ${v}")}

    def cSubstr = {a, b -> a-b}
    def newClosure = cSubstr.curry(10)
    println(newClosure(8))

// find and findall
    println(names.find {it == "Tom"})
    println(names.findAll {it == "Tom"})

// any and every
    println(names.any {it.startsWith("B")}) // true
    println(names.any {it.startsWith("G")}) // false
    println(names.every() {it.startsWith("B")}) // false
    println(names2.every() {it.startsWith("B")}) // true

// groupBy
    println(names.groupBy {it.startsWith("B")})
    println(names.groupBy {it.toCharArray().size()})