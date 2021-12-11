package money

abstract class Money {

    protected var amount : Int = 0
    protected var currency : String = ""

    override fun equals(other: Any?): Boolean{
        var money = other as Money
        return amount == money.amount && this.javaClass == money.javaClass
    }

    constructor(amount: Int, currency: String){
        this.amount = amount
        this.currency = currency
    }
    abstract fun times(multiplier: Int) :Money

    fun currency(): String{
        return currency
    }

    companion object {
        fun dollar(amount: Int): Money {
            return Dollar(amount, "USD");
        }
        fun franc(amount: Int): Money {
            return Franc(amount, "CHF");
        }
    }
}