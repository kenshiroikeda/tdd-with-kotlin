package money

class Franc() : Money() {

    constructor(amount: Int) : this() {
        this.amount = amount
    }
    override fun times(multiplier:Int) : Money{
        return Franc(amount * multiplier) as Money
    }

}