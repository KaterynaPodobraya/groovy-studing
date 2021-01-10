package hometasks.annotations

import groovy.transform.Canonical
import groovy.transform.Sortable

Person p1 = new Person("Katie","Vega", "New York", 20)
Person p2 = new Person("Dan","Vega", "London", 15)
Person p3 = new Person("Andy","Vega", "Tokyo", 21)
Person p4 = new Person("Andy","Vega", "Tokyo", 20)
Person p5 = new Person("Andy","Vega", "Tokyo", 22)
Person p6 = new Person("Joe","Vega", "New York", 30)
Person p7 = new Person("Jason","NotaVega", "London", 10)

def vegas = [p1,p2,p3,p4,p5,p6,p7 ]

vegas.each {println it}
println('------------------------------------')
vegas.toSorted().each {println it}

@Canonical
@Sortable(includes = ['name', 'age'])
class Person {
    String name, surname, town
    int age
}



