package money

open class Money {

    protected var amount : Int = 0

    override fun equals(other: Any?): Boolean{
        var money = other as Money
        return amount == money.amount
    }

}