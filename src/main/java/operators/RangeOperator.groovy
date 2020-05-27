package operators

class RangeOperator {
// http://docs.groovy-lang.org/latest/html/gapi/groovy/lang/Range.html
   static void main(String[] args) {
   // a groovy.lang.Range implements the List interface
       def range = 0..5
       assert (0..5).collect() == [0, 1, 2, 3, 4, 5]
       assert range.collect() == [0, 1, 2, 3, 4, 5]
       assert (0..<5).collect() == [0, 1, 2, 3, 4]
       assert range instanceof List
       assert (0..5).size() == 6
       assert ('a'..'d').collect() == ['a','b','c','d']

       assert range.containsWithinBounds(6) == false
       assert range.containsWithinBounds(4)

       assert range.getFrom() == 0
       assert range.getTo() == 5

       println(range.inspect())

       def rangeReverse = 5..0
       assert rangeReverse.isReverse()

       println(rangeReverse.step(2))
   }
}