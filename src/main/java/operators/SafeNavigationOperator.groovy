package operators

class SafeNavigationOperator{

    static void main(String[] args) {
       SafeNavigationOperator.Person person
       println   person?.name + " PERSON NAME !!!!"
       //println   person.name + "PERSON NAME !!!!"
   }

    static class Person{
        def name
    }
}