package hometasks.control_flows

// if( boolean expression is true ) { //logic }

if( true ) {
    println "true"
}
// or
if( true )
    println true

def someage = 37
if( someage >= 21 && someage < 35 ) {
    println "buy some beer"
} else if( someage >= 35 ) {
    println "run for president"
} else {
    println "under 21..."
}

// -------------------------------------------------------
// ternary operator (expression) ? true : false
def msg
def output = (msg != null) ? msg : 'default message...'
// Elvis
def elvisOutput = msg ?: 'default message...'

println msg
println output
println elvisOutput

// -------------------------------------------------------

def num = 12
switch( num ) {
    case 1 :
        println "1"
        break
    case 2 :
        println "2"
        break
    case 1..3 :
        println "in range 1..3"
        break
    case [1,2,12] :
        println "num is in list [1,2,12]"
        break
    case Integer :
        println "num is an Integer"
        break
    case Float :
        println "num is a float"
        break
    default :
        println "default..."
}

// in
def validAges = 18..35
def someAge = 19
println someAge in validAges






