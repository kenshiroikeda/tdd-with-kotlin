package money

class Dollar() {

    private var amount : Int = 0

    constructor(amount: Int) : this() {
        this.amount = amount
    }
    fun times(multiplier:Int) : Dollar{
        return Dollar(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean{
        var dollar = other as Dollar
        return amount == dollar.amount
    }
}