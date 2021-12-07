package money

class Franc() {

    private var amount : Int = 0

    constructor(amount: Int) : this() {
        this.amount = amount
    }
    fun times(multiplier:Int) : Franc{
        return Franc(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean{
        var dollar = other as Franc
        return amount == dollar.amount
    }
}