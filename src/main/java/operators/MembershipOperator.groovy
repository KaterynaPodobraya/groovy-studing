package operators

class MembershipOperator {

   static void main(String[] args) {
   // in operator the same as isCase(), contains()
       def list = ['Grace','Rob','Emmy']
       assert ('Emmy' in list)
       assert ('Kate' in list)
   }
}