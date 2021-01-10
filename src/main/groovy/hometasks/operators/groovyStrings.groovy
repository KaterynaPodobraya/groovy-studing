package hometasks.operators

Closure cl = {println "Test ${it}"}
cl 'me'

println 'Single string: ' + 'single'.getClass()
println 'Double string: ' + "double".getClass()
println "When interpolation is present than it is a Groovy string: " + "double ${cl 5}".getClass()
println 'Triple string ' + '''triple
triple
triple'''.getClass()


