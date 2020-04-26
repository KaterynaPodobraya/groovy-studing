package operators

class PrecedenceShortCircuiting {
    def static called

   static void main(String[] args) {
       // The logical "not" has a higher priority than the logical "and".
       assert (!false && false) == false
       //assert (!false && false) == true

       // The logical "and" has a higher priority than the logical "or".
       assert true || true && false
       //assert (true || true && false) == false

       called = false
       true || checkIfCalled()
       assert !called
       //assert called == false

       called = false
       false || checkIfCalled()
       assert called

       called = false
       false && checkIfCalled()
       assert !called

       called = false
       true && checkIfCalled()
       assert called
   }

   static boolean checkIfCalled() {
       called = true
   }
}