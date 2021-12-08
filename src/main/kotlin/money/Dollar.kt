package money

class Dollar() : Money() {

    constructor(amount: Int) : this() {
        this.amount = amount
    }
    fun times(multiplier:Int) : Dollar{
        return Dollar(amount * multiplier)
    }

}