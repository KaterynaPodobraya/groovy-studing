package operators

class TernaryElvisOperator {

   static void main(String[] args) {
       def str = "If string is not empty it is evaluated to true"
       def assignedValue = str ? str : "default string"
       println assignedValue
       def elvisAssignedValue = str ?: "default string"
       println elvisAssignedValue
   }
}