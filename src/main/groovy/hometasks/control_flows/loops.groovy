package hometasks.control_flows

// Looping
// --------------------------------------------

// while
List numbers = [1,2,3]
while( numbers ) {
    // do something
    numbers.remove(0)
}
assert numbers == []

// for
// for( variable in iterable ) {}

List nums = [1, 15, 2, 20, 3]
for( Integer i in 1..10 ) {
    println i
}

// return/break/continue
Integer a = 1
while( true ) { // infinite loop
    a++
    println a
    break
}
assert a == 2

for( String s in 'a'..'z' ){
    if( s == 'a') continue
    println s
    if( s > 'b' ) break
}

// do-while
// classic Java-style do..while loop
def count = 5
def fact = 1
do {
    println "Count is ${count}, fact is ${fact} "
    fact *= count--
    println "Count is ${count}, fact is ${fact} "
} while(count > 1)
assert fact == 120

// Enhanced classic Java-style for loop
def fctrs = []
def cnt = 5
for (int fctr = 1, i = 1; i <= cnt; i++, fctr *= i) {
    fctrs << fctr
}
assert fctrs == [1, 2, 6, 24, 120]




