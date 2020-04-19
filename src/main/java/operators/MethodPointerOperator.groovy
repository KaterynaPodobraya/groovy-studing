package operators

class MethodPointerOperator {

   public static void main(String[] args) {
      def multiplyer = Math.&multiplyExact(5, 6)
      println multiplyer
      println multiplyer
      println multiplyer
   }
}