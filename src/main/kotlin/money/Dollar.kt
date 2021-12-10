package money

class Dollar() : Money() {

    constructor(amount: Int) : this() {
        this.amount = amount
    }
    override fun times(multiplier:Int) : Money{
        return Dollar(amount * multiplier) as Money
    }

}