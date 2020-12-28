package hometasks.gdk

def today = new Date()
println("Today is ${today}")
println("Formatted today is ${today.format('d-Y-M')}")

println "Tommorow is ${today.next()}"
println "Yesterday is ${today.previous()}"
println "Today plus 2 is ${today.plus(2)}"
println "Today minus 3 is ${today.minus (3)}"

def threeDaysLater = today + 3

Range range = today .. threeDaysLater
range.each {println(it)}

threeDaysLater.downto today ,{it -> println it}