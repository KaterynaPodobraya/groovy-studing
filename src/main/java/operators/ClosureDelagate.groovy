package operators

/*
this: refers to the instance of the class that the closure was defined in.
owner: is the same as this, unless the closure was defined inside another closure in which case the owner refers to the outer closure.
delegate: is the same as owner. But, it is the only one that can be programmatically changed, and it is the one that makes Groovy closures really powerful.
*/

// https://dzone.com/articles/groovy-closures-owner-delegate

public class MyClass {
    def outerClosure = {
        println this.class.name    // outputs MyClass
        println owner.class.name    // outputs MyClass
        println delegate.class.name  //outputs MyClass
        def nestedClosure = {
            println this.class.name    // outputs MyClass
            println owner.class.name    // outputs MyClass$_closure1
            println delegate.class.name  // outputs MyClass$_closure1
        }
        nestedClosure()
    }
}
def closure = new MyClass().outerClosure
closure()
//==================================================================================================

// Default strategy owner.first
def appender= {
    append("Test_1")
    append('Test_2')
}

    public String append(String s){
       println "Append from MyClass $s"
    }

def sb = new StringBuffer()
appender.resolveStrategy = Closure.DELEGATE_FIRST
//appender.resolveStrategy = Closure.OWNER_ONLY
appender.delegate = sb
println appender()

