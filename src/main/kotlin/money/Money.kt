package money

open class Money {

    private var amount : Int = 0
    private var currency : String = ""

    constructor(amount: Int, currency: String){
        this.amount = amount
        this.currency = currency
    }

    override fun equals(other: Any?): Boolean{
        var money = other as Money
        return amount == money.amount && currency.equals(money.currency)
    }

    open fun times(multiplier: Int) :Money{
        return Money(amount * multiplier, currency)
    }

    fun currency(): String{
        return currency
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