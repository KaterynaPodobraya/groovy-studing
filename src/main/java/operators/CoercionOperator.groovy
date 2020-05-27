package operators

class CoercionOperator {

   static void main(String[] args) {
       // The coercion operator (as) is a variant of casting.

       Long x = 123L
       String test = x
       println(test)
       String s = (String) x

       Integer y = 123
       String str = x as String
   }
}