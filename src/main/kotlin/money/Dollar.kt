package money

class Dollar() {

    var amount : Int = 0

    constructor(amount: Int) : this() {
        this.amount = amount
    }
    fun times(multiplier:Int) : Dollar{
        return Dollar(amount * multiplier)
    }

}