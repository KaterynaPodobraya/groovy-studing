package operators

class SpreadOperator{

   static List spreadList(List list){
       [1, 2, 3, 't', *list, "test"]

   }
   static spreadMap(Map map){
       [1: "v1", *:map, 2: "v2"]
   }

    static spreadArguments(String s1, String s2, String s3){
        println s1 + " " + s2 + " " +s3
    }

    static void main(String[] args) {
       def toSpread = [99, 100, 500]
       println (spreadList(toSpread))
       def mapToSpread = ["test1":"test val1"]
       println (spreadMap(mapToSpread))
       def arguments = ["Teddy", "loves", "honey"]
       spreadArguments(*arguments)
   }
}