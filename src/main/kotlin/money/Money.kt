package money

open class Money : Expression{

    var amount : Int = 0
    var currency : String = ""

    constructor(amount: Int, currency: String){
        this.amount = amount
        this.currency = currency
    }

    override fun times(multiplier: Int) :Expression{
        return Money(amount * multiplier, currency)
    }

    override fun plus(addend: Expression): Expression {
        return Sum(this, addend)
    }

    override fun reduce(bank: Bank, to: String): Money{
        var rate = bank.rate(currency, to)
        return Money(amount/rate, to)
    }

    fun currency(): String{
        return currency
    }

    override fun equals(other: Any?): Boolean{
        var money = other as Money
        return amount == money.amount && currency.equals(money.currency)
    }

    override fun toString(): String {
        return "$amount $currency"
    }

    companion object {
        fun dollar(amount: Int): Money {
            return Money(amount, "USD");
        }
        fun franc(amount: Int): Money {
            return Money(amount, "CHF");
        }
    }
}