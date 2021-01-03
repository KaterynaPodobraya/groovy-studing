package hometasks.control_flows

def foo() {
    // do stuff
    throw new Exception("Foo Exception")
}

List log = []

try {
    foo()
} catch( Exception e ) {
    log << e.message
} finally {
    log << 'finally'
}

println log

// Java 7 introduced a multi catch syntax
private Integer getObject(){
    List<Integer> list = null
    list.get(5)
}

try {
    getObject()
} catch( FileNotFoundException | NullPointerException e ) {
    println e.class.name
    println e.message
}

