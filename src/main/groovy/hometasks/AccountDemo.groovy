package hometasks

class Account {
    BigDecimal balance = 0

    def deposit(Number number){
        if(number < 0){
            throw new Exception("Amount is less than zero !!!")
        }
        balance += number
    }

    def deposit(List<Number> numbers){
        for(number in numbers){
            println(number)
            try{
                deposit(number)
            }catch(Exception e){
                println e.getMessage()
            }
        }
    }
}

Account account = new Account()
def testList = [1,0,-1,100000000]
account.deposit(testList)
println(account.balance)

