package operators

class SafeNavigationOperator{

   public static void main(String[] args) {
       SafeNavigationOperator.Person person
       println   person?.name + " PERSON NAME !!!!"
       //println   person.name + "PERSON NAME !!!!"
   }

    static class Person{
        def name
    }
}