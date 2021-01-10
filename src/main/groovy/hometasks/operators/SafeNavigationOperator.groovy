package hometasks.operators

class SafeNavigationOperator{

    static void main(String[] args) {
       SafeNavigationOperator.Person person
       println  ( " ${person?.name} PERSON NAME !!!!")
       println  ( " ${person?.age} PERSON AGE !!!!")
       println( person?.doSmth())

        person = new Person()
        person.name = 'Katya'

        println  ( " ${person?.name} PERSON NAME !!!!")
    }

    static class Person{
        def name

        int doSmth(){
            5
        }
    }
}