package hometasks

class Account {
    BigDecimal balance = 0
    String type

    void deposit(BigDecimal amount){
        this.balance += amount
    }

    BigDecimal withdraw(BigDecimal amount){
        (this.balance - amount) >= 0 ? this.balance -= amount : 0
    }

    BigDecimal plus (Account account){
      def total = this.balance + account.balance
    }
}
