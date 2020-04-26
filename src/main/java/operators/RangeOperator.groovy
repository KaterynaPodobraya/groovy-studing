package operators

class RangeOperator {

   static void main(String[] args) {
   // a groovy.lang.Range implements the List interface
       def range = 0..5
       assert (0..5).collect() == [0, 1, 2, 3, 4, 5]
       assert range.collect() == [0, 1, 2, 3, 4, 5]
       assert (0..<5).collect() == [0, 1, 2, 3, 4]
       assert range instanceof List
       assert (0..5).size() == 6
   }
}