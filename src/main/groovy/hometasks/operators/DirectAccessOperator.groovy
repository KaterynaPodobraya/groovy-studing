package hometasks.operators

class DirectAccessOperator {

   static void main(String[] args) {
       DirectAccessOperator.Person person = new Person()
       person.name = "Name"

       //use of .@ forces usage of the field instead of the getter
       println person.@name
       // getter is used
       println person.name
   }

    static class Person{
        String name
    }
}