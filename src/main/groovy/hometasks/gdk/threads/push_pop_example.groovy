package hometasks.gdk.threads

List numbers = []

// push
10.times {
    println "push\t: ${it}"
    numbers << it
}

println Thread.currentThread().name
println numbers

for( i in 9..0 ) {
    println "pop\t: ${i}"
    numbers.pop()
}

println Thread.currentThread().name
println numbers

// but what if we wanted to do this concurrently
// Code is running in one Thread - main