package money

abstract class Money {

    protected var amount : Int = 0

    override fun equals(other: Any?): Boolean{
        var money = other as Money
        return amount == money.amount && this.javaClass == money.javaClass
    }

    abstract fun times(multiplier: Int) :Money

    companion object {
        fun dollar(amount: Int): Money {
            return Dollar(amount);
        }
        fun franc(amount: Int): Money {
            return Franc(amount);
        }
    }
}